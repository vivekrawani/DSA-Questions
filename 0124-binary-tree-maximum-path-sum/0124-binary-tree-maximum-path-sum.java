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
        if(root == null)
            return 0;
        int res[] = {Integer.MIN_VALUE};
        helperFun(root, res);
        // int left = helperFun(root.left, res);
        // int right = helperFun(root.right, res);
        // res[0] = Math.max(left+right+root.val, res[0]);
        return res[0];
    }
    
    private int helperFun(TreeNode root, int[] res)
    {
        if(root == null)
            return 0;
        int left = helperFun(root.left, res);
        int right = helperFun(root.right, res);
        int sum = root.val;
        if(left >= 0 )
            sum += left;
        if(right >= 0)
            sum += right;
        //int sum = left + right + root.val;
        res[0] = Math.max(sum, res[0]);
        
        int max1 = Math.max(left , right ) + root.val;
        
        return Math.max(max1, root.val);
    }
}