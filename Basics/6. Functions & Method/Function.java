
import java.util.Scanner;

public class Function {

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter a: ");
        a = sc.nextInt();

        int b;
        System.out.print("Enter b: ");
        b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 number: " + sum);

        // String name = sc.next();
        // printMyName(name); // call kiya function ko
    }
}
