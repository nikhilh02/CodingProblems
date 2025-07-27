package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(int[] nums, int index, List<Integer> subset,
                          List<List<Integer>> res) {
        res.add(new ArrayList<>(subset));

        for(int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(nums, i + 1, subset, res);
            subset.remove(subset.size() - 1);
        }
    }
}

/*
Time Complexity: O(N * 2^N)
Space Complexity: O(n)
 */
