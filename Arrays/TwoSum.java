package Arrays;/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int diff = 0;
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < len; i++){
            diff = target - nums[i];
            if(seen.containsKey(diff)){
                return new int[]{seen.get(diff), i};
            }
            seen.put(nums[i], i);
        }
        return null;
    }
}

// Time Complexity: O(n)
