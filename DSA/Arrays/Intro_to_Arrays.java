
import java.util.Scanner;

public class Intro_to_Arrays {

    @SuppressWarnings({"unused", "resource"})
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        int phy;
        phy = sc.nextInt();

        System.out.println("Length of array = " + marks.length);

        marks[0] = sc.nextInt();     // phy
        marks[1] = sc.nextInt();    // chem
        marks[2] = sc.nextInt();    // math
        marks[3] = sc.nextInt();    // cs
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);
        System.out.println("cs : " + marks[3]);
        marks[0] = marks[0] + 1;
        marks[1] = marks[1] + 1;
        marks[2] = marks[2] + 1;
        marks[3] = marks[3] + 1;
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Math : " + marks[2]);
        System.out.println("ComputerScience : " + marks[3]);
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3]) / 4;
        System.out.println("Percentage = " + percentage + "%");
    }
}
