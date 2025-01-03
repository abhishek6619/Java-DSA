import java.util.Scanner;

public class Sumofthrreenum {

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
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
        int c;
        System.out.print("Enter c: ");
        c = sc.nextInt();

        int sum = sum(a, b, c);
        System.out.print("Sum of 3 number: " + sum);
    }

}
