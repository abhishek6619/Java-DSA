import java.util.Scanner;

public class Factorial {
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void printFactorial(int n) {
        
        // loop
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        // Calculate factorial using a loop
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
