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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levelOrder = new ArrayList<>();

        if(root==null){
            return levelOrder;
        }

        queue.add(root);
        queue.add(null);
        List<Integer> currLevel = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            if(curr!=null){
                currLevel.add(curr.val);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
            } else {
                if(!queue.isEmpty()){
                    queue.offer(null);
                }
                levelOrder.add(currLevel);
                currLevel=new ArrayList<>();
            }
        }
        Collections.reverse(levelOrder);
        return levelOrder;
    }
}