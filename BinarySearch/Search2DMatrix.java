package BinarySearch;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r = m * n - 1;
        while(l <= r){
            int mid = l + ((r - l)/2);
            int midElement = matrix[mid/n][mid%n];
            if(midElement == target)
                return true;
            else if(midElement < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }
}

/*
Time Complexity: O(log(m * n))
Space Complexity: O(n)
 */
