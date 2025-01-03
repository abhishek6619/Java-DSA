
import java.util.Scanner;

@SuppressWarnings("unused")
public class Floyd_Triangle {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        int num;
        System.out.print("Enter num: ");
        num = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
