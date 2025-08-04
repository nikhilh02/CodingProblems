import java.util.LinkedList;

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
class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null)
            return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node == null)
                continue;
            if(node.val == subRoot.val)
                return isSame(node, subRoot);
            q.add(node.left);
            q.add(node.right);
        }
        return false;
    }

    boolean isSame(TreeNode a, TreeNode b){
        if(a == null && b == null)
            return true;
        if(a == null || b == null)
            return false;
        if(a.val != b.val)
            return false;

        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }
}