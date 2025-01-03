
import java.util.Scanner;

public class Average {

    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    @SuppressWarnings({"resource"})
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

        int avg = average(a, b, c);
        System.out.print("Average of 3 Number: " + avg);
    }
}
