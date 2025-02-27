import java.util.*;

@SuppressWarnings("unused")
public class ArraysCC {

    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int nonChangable = 5;
        update(marks, nonChangable);

        System.out.println("nonChangable: " + nonChangable);

        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + "");
        }
        System.out.println();

        // Linear Search
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        // String menu[] = { "dosa", "chole bhature", "samosa" };
        int key = 20;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
