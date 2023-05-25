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
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node;
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            node = stack.pop();
            
            if(node != null){
                list.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        
        return list;
    }
}