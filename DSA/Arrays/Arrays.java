
import java.util.Scanner;

public class Arrays {

    @SuppressWarnings({"resource"})
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        marks[0] = sc.nextInt();     // phy
        marks[1] = sc.nextInt();    // chem
        marks[2] = sc.nextInt();    // math
        marks[3] = sc.nextInt();    // computer

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);
        System.out.println("computer : " + marks[3]);
    }
}
