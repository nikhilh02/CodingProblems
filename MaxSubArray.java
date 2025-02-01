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
