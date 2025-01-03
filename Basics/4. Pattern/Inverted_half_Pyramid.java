
import java.util.Scanner;

@SuppressWarnings("unused")
public class Inverted_half_Pyramid {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        // outer loop
        for (int i = n; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; ++j) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
