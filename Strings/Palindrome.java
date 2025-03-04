package Strings;

//Two-pointer approach
public class Palindrome {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r){
            // Move left pointer to the next alphanumeric character
            while(l < r && !Character.isLetterOrDigit(s.charAt(l)))
                l++;
            while(l < r && !Character.isLetterOrDigit(s.charAt(r)))
                r--;
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;

            // Move pointers towards the center
            l++;
            r--;
        }
        return true;
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(1)
 */
