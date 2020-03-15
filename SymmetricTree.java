/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }


    public boolean check(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null) return true;
        if(node1 == null && node2 != null) return false;
        if(node1 != null && node2 == null) return false;
        if(node1.val != node2.val) return false;
        return check(node1.left, node2.right) && check(node1.right, node2.left);
    }
}