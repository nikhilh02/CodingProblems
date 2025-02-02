/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int res = nums[0];
        for(int i = 0; i < nums.length; i++){
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            res = Math.max(sum, res);
        }
        return res;
    }
}

/*
Kadane's Algorithm
Time Complexity: O(n)
Space Complexity: O(1)
 */
