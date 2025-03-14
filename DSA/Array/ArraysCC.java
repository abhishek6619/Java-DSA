import java.util.*;

@SuppressWarnings("unused")
public class ArraysCC {

    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[], int keys) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == keys) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Samallest value is : " + smallest);
        return largest;
    }

    public static int binarySearch(int n[], int key) {
        int start = 0, end = n.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (n[mid] == key) {
                return mid;
            }
            if (n[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int rev[]) {
        int first = 0, last = rev.length - 1;

        while (first < last) {
            // swap
            int temp = rev[last];
            rev[last] = rev[first];
            rev[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int pairs[]) {
        int tp = 0;
        for (int i = 0; i < pairs.length; i++) {
            int curr = pairs[i]; // 2 4 6 8 10
            for (int j = i + 1; j < pairs.length; j++) {
                System.out.print("(" + curr + "," + pairs[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
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
        String menu[] = { "dosa", "chole bhature", "samosa" };
        int key = 20;

        int index = linearSearch(numbers, key);
        if (index == -1) {
        System.out.println("Not Found");
        } else {
        System.out.println("Key is at index: " + index);
        }

        // Largest Number
        int num[] = { 1, 2, 6, 3, 5 };
        System.out.println("Largest value is : " + getLargest(num));

        // Binary Search
        int n[] = { 2, 4, 6, 8, 10, 12, 14 };
        int keys = 25;
        System.out.println("Index for key is : " + binarySearch(n, key));

        // Reverse Array
        int rev[] = { 2, 4, 6, 8, 10 };
        reverse(rev);
        for (int i = 0; i < rev.length; i++) {
        System.out.println(rev[i] + "");
        }
        System.out.println();

        // Pair of elements
        int pairs[] = { 2, 4, 6, 8, 10 };
        printPairs(pairs);
    }
}
