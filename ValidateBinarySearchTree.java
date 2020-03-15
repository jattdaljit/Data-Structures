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
    public boolean isValidBST(TreeNode root) {
        Stack<Integer> stack = new Stack<Integer>();
        int stackSize = check(root, stack, 0);
        if(stack.size() == stackSize) {
            return true;
        } else {
            return false;
        }
    }

    public int check(TreeNode root, Stack<Integer> stack, Integer stackSize) {
        if(root == null) return stackSize;
        int  count = check(root.left, stack, stackSize);

        count++;
        if(!stack.isEmpty()) {
            int a = stack.peek();
            if(root.val > a) {
                stack.push(root.val);
            }
        } else {
            stack.push(root.val);
        }
        int c = check(root.right,stack,count);

        return c;
    }
}