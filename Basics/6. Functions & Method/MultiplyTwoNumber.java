
import java.util.Scanner;

public class MultiplyTwoNumber {
    public static int multiply(int a, int b) {
        int multi = a * b;
        return multi;
    }
    /*
     * Another way of calling a function
     * public static int calculateProduct(int a, int b) {
     * return a * b;
     * }
     */

    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a: ");
        a = sc.nextInt();

        int b;
        System.out.print("Enter b: ");
        b = sc.nextInt();

        int mul = multiply(a, b);
        System.out.print("Product of 2 number: " + mul);

        /*
         * Another Way
         * System.out.println("Product of 2 number: " + calculateProduct(a, b));
         */
    }
}
