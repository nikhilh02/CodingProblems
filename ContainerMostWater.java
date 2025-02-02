/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
 */

public class ContainerMostWater {
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;

        while (l < r) {
            res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
 */
