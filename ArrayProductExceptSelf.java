/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */

public class ArrayProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for(int i = 1; i < n; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        int postfix = 1;
        for(int i = n-1; i >= 0; i--){
            answer[i] = answer[i] * postfix;
            postfix = postfix * nums[i];
        }
        return answer;
    }
}

/*
Time complexity:O(n)
Space complexity:O(1)
 */
