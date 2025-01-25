import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int diff = 0;
        Map<Integer, Integer> seen = new HashMap<Integer, Integer>();
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
