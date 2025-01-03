
import java.util.Scanner;

@SuppressWarnings("unused")
public class Inverted_Half_Pyramid180rotate {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // inner loop -> space print
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop -> star print
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
