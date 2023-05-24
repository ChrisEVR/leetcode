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
    public short calcDepth(TreeNode root, short depth){
        int left = root.left != null ? calcDepth(root.left, (short)(depth + 1)) : depth;
        int right = root.right != null ? calcDepth(root.right, (short)(depth + 1)) : depth;
        return (short)Math.max(left, right);
    }
    
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : calcDepth(root, (short)1);
    }
}