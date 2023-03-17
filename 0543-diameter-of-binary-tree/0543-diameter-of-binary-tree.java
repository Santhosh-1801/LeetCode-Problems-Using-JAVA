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
    public int diameterOfBinaryTree(TreeNode root) {
        int dia[] = new int[1];
        htree(root,dia);
        return dia[0];
    }
    public int htree(TreeNode root , int diameter[]){
        if(root == null) return 0;
        int lh = htree(root.left,diameter);
        int rh = htree(root.right,diameter);
        diameter[0] = Math.max(diameter[0],lh+rh);
        return 1 + Math.max(lh,rh);
    }
}