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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return check(t1,t2);
    }

    public TreeNode check(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null) return null;
        if(node1 == null) {
            return node2;
        }
        if(node2 == null) {
            return node1;
        }
        node1.val = node1.val + node2.val;

        node1.left = check(node1.left, node2.left);
        node1.right = check(node1.right, node2.right);
        return node1;
    }
}