
import java.util.Scanner;

public class Arrays {

    @SuppressWarnings({"resource", "unused"})
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        int phy;
        phy = sc.nextInt();

        System.out.println("Length of array = " + marks.length);

        marks[0] = sc.nextInt();     // phy
        marks[1] = sc.nextInt();    // chem
        marks[2] = sc.nextInt();    // math
        marks[3] = sc.nextInt();    // math
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);
        System.out.println("math : " + marks[3]);
        marks[2] = marks[2] + 1;
        System.out.println("math : " + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3]) / 3;
        System.out.println("Percentage = " + percentage + "%");
    }
}
