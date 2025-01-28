/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dup = new HashSet<>();
        for(int i: nums){
            if(dup.contains(i))
                return true;
            dup.add(i);
        }
        return false;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */
