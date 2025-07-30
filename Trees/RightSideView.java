package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode rightSide = null;
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                if(node != null){
                    rightSide = node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(rightSide != null) {
                res.add(rightSide.val);
            }
        }
        return res;
    }
}
