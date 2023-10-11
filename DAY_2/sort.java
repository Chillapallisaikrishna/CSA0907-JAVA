import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[] = {"Banana", "Apple", "Carrot", "Radish", "Jack"};
System.out.println("choose acsending or descending(A/D)");
        int len = arr.length;
        char order = input.next().charAt(0);

        if (order == 'A') {
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (arr[i].compareTo(arr[j]) > 0) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        } else if (order == 'D') {
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (arr[i].compareTo(arr[j]) < 0) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
