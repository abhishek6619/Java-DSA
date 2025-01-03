
import java.util.Scanner;

@SuppressWarnings("unused")
public class Solid_Rectangle {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        int m;
        System.out.print("Enter m: ");
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
