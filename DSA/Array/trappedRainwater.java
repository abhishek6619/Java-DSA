// Trapping Rainwater

import java.util.*;

public class trappedRainwater {
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary - array
        int lefftMax[] = new int[n];
        lefftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            lefftMax[i] = Math.max(height[i], lefftMax[i - 1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(lefftMax[i], rightMax[i]);

            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }
}
