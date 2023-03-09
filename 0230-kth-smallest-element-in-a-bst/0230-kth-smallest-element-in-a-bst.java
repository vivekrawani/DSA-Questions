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
    public int kthSmallest(TreeNode root, int k) {
    int k1[] = {k};
     return solve(root, k1);
	
    }
    private int solve(TreeNode root, int k[]){
        if(root == null)
            return -1;
        if(root.left == null && root.right == null)
        {
            k[0]--;
            if(k[0] == 0)
                return root.val;
            else return -1;
        }
        int left = solve(root.left, k);
        
        if(left != -1)
            return left;
        
        k[0]--;
        if(k[0] == 0)
            return root.val;
        
        int right = solve(root.right, k);
        if(right != -1)
            return right;
        
        return -1;
    }
}