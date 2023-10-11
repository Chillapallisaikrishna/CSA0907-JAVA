import java.util.Scanner;
public class EvenIndexFibonacciSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int evenIndexSum = calculateEvenIndexFibonacciSum(n);
        System.out.println("Sum of even-indexed Fibonacci terms up to N: " + evenIndexSum);
    }
    private static int calculateEvenIndexFibonacciSum(int n) {
        if (n <= 1) {
            return 0; 
        }
        int fib0 = 0, fib1 = 1, evenIndexSum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenIndexSum += fib0;
            }
            int nextFib = fib0 + fib1;
            fib0 = fib1;
            fib1 = nextFib;
        }
        return evenIndexSum;
    }
}