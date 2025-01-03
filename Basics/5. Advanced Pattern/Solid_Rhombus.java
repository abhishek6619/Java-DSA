import java.util.Scanner;

public class Solid_Rhombus {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
