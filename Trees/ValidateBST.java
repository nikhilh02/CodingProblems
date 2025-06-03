package Trees;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        Stack<TreeNode> st = new Stack<>();
        TreeNode min = null;
        while(root !=null || !st.isEmpty()){
            //Traverse left subtree and push to stack
            while(root != null){
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if(min != null && root.val <= min.val)
                return false;
            min = root;
            //Traverse right subtree
            root = root.right;
        }
        return true;
    }
}
