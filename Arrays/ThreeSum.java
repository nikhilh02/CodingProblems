package Arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                break;
            //To avoid duplicate triplets
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int l = i + 1, r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0)
                    r--;
                else if(sum < 0)
                    l++;
                else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    //To avoid 2nd element duplicate triplets
                    while(l < r && nums[l] == nums[l - 1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}

/*
Time Complexity: O(n^2)
Space Complexity: O(1)
 */