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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode aux;
        
        if(root == null) return ans;

        stack.push(root);

        while(!stack.isEmpty()){
            aux = stack.pop();
            ans.addFirst(aux.val);

            if(aux.left != null) stack.push(aux.left);

            if(aux.right != null) stack.push(aux.right);
        }
        
        return ans;
    }
}