import java.util.Scanner;
public class Conditional {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        // To check Even or Odd
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("a is lesser");
        }
        // other to write
        if (a == b) {
            System.out.println("Equal");
        } else {
            if (a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
            }
        }

        int button = sc.nextInt();
        // if (button == 1) {
        // System.out.println("Hello");
        // } else if (button == 2) {
        // System.out.println("Namaster");
        // } else if (button == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("Invalid Button");
        // }
        switch (button) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaster");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Invalid Button");
        }
    }
}