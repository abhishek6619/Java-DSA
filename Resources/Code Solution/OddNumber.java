import java.util.Scanner;

public class OddNumber {
    public static int odd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        int odd = odd(n);
        System.out.print("Sum of Odd Number: " + odd(n));
    }
}
