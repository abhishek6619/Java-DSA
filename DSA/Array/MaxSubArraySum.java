import java.util.*;

@SuppressWarnings("unused")
public class MaxSubArraySum {
    public static void maxSubarraysSum(int sub[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[sub.length];

        prefix[0] = sub[0];
        // calculate prefix array
        for (int i = 1; i < sub.length; i++) {
            prefix[i] = prefix[i - 1] + sub[i];
        }

        for (int i = 0; i < sub.length; i++) {
            int start = i;
            for (int j = i; j < sub.length; j++) {
                int end = j;
                // currSum = 0;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // for (int k = start; k <= end; k++) {
                // // subarray sum
                // currSum += sub[k];
                // }
                // System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }

    // Kadane's Algorithm
    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs += number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Subarray Sum: " + ms);
    }

    public static void main(String[] args) {
        int sub[] = { 1, -2, 6, -1, 3 };
        maxSubarraysSum(sub);

        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(number);
    }
}
