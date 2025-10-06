package Trees;

import java.util.Stack;

public class KSmallestBST {
    public int kthSmallest(TreeNode root, int k) {
        int n = 0;
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !st.isEmpty()) {
            while(curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            n += 1;
            if(n == k)
                return curr.val;
            curr = curr.right;
        }
        return -1;
    }
}
