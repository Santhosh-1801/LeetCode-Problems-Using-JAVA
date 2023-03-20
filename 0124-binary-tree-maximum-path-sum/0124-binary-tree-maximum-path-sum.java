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
    public int maxPathSum(TreeNode root) {
        int maxValue[]=new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        maximumPathsum(maxValue,root);
        return maxValue[0];
        
        
    }
    public int maximumPathsum(int maxValue[],TreeNode node){
        if(node==null)
        {
            return 0;
        }
        int left=Math.max(0,maximumPathsum(maxValue,node.left));
        int right=Math.max(0,maximumPathsum(maxValue,node.right));
        maxValue[0]=Math.max(maxValue[0],node.val+left+right);
        return Math.max(left,right)+node.val;
    }
}