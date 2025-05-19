import java.util.*;

public class Variable {
    public static void main(String[] args) {

        // Average of three number
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
        int avg = (a + b + c) / 3;
        System.out.print("Average of 3 Number: " + avg);

        // Square of a number
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        int square = num * num;
        System.out.println("Square of " + num + " is: " + square);
    }
}
