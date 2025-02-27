package Strings;

import java.util.*;

//Sliding Window

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //Left pointer and variable res to store the maximum length of the substring
        int l = 0, res = 0;
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int r = 0; r < s.length(); r++){
            // If the character is already in the map, update 'l' to exclude the previous occurrence
            if(mp.containsKey(s.charAt(r))){
                // Move 'l' to the right of the last occurrence of currentChar
                l = Math.max(mp.get(s.charAt(r))+1, l);
            }
            // Update the last seen index of the current character
            mp.put(s.charAt(r), r);
            // Calculate the length of the current substring and update max length if needed
            res = Math.max(r-l+1, res);
        }
        return res;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(m)
 */
