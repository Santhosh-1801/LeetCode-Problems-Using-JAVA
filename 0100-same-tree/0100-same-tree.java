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
    public boolean isSameTree(TreeNode p, TreeNode q) {
     List<Integer> a=new LinkedList<>();
     List<Integer> b=new LinkedList<>();
     checkTree(p,a);
     checkTree(q,b);
     return a.equals(b);
        
        
    }
    public void checkTree(TreeNode temp,List<Integer> l)
    {
        if(temp==null)
        {
            return ;
        }
        checkTree(temp.left,l);
        l.add(temp.val);
        checkTree(temp.right,l);
        if(temp.left==null)
        {
            l.add(null);
        }
        if(temp.right==null)
        {
            l.add(null);
        }
      
    }
}