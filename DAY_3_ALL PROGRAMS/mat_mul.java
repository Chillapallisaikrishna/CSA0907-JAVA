import java.util.Scanner;
public class mat_mul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = input.nextInt();

        int mat1[][] = new int[r][c];
        int mat2[][] = new int[r][c];

        System.out.println("Enter elements for matrix 1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter elements for matrix 2:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = input.nextInt();
            }
        }
System.out.println("Final Matrix: ");
        int sum[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    sum[i][j] = sum[i][j] + (mat1[i][k] * mat2[k][j]);
                }

                System.out.print(sum[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
