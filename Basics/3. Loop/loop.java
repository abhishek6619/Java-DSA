import java.util.Scanner;

public class loop {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        /**/
        for (int counter = 0; counter < 11; counter++) {
            System.out.print(counter + " ");
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }

        int a = 0;
        do {
            System.out.println(a);
            i++;
        } while (a < 11);

        int s = 12;
        while (s < 11) {
            System.out.println("Apna College");
        }

        do {
            System.out.println("Apna College");
        } while (i < 11);

        // sum of first natural number

        /**/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int b = 0; b <= num; b++) {
            sum = sum + b;
        }
        System.out.println(sum);

        // Table of number
        Scanner ab = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = ab.nextInt();

        for (int k = 1; k < 11; k++) {
            // System.out.println(k * n);
            System.out.println(n + " * " + k + " = " + (n * k));
        }
    }
}