import java.util.Scanner;
public class Composite_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            int c = 0;
            for (int j = 1; j < 100; j++) {
                if (arr[i] % j == 0) {
                    c++;
                }
            }
            if (c > 2)
                count++;
        }
        System.out.println("Composite Numbers: " + count);
    }
}
