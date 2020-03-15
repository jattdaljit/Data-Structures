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
    public boolean hasPathSum(TreeNode root, int sum) {
        return check(root, sum);
    }

    public boolean check(TreeNode node, int sum){
        if(node == null ) return false;
        if(node.val == sum && node.left == null && node.right == null) return true;
        return check(node.left, sum - node.val) || check(node.right, sum - node.val);
    }
}