
import java.util.Scanner;

public class VoteOrNot {

    public static int eligible(int n) {
        if (n >= 18) {
            System.out.print("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
        return n;
    }

    @SuppressWarnings({"resource", "unused"})
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter a: ");
        n = sc.nextInt();
        int eligible = eligible(n);
    }
}
