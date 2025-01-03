import java.util.Scanner;

public class variable {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Variables
        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.println(sum);

        int diff = b - a;
        System.out.println(diff);

        int mul = a * b;
        System.out.println(mul);

        // Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // nextInt()
        // nextFloat()
        System.out.println(name);
    }
}

