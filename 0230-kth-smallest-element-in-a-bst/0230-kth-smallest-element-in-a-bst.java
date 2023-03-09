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
     List<Integer> ls = new ArrayList<>(); 
     solve(root, ls);
	return ls.get(k-1);
    }
    private void solve(TreeNode root, List<Integer> ls){
        if(root == null)
            return;
        if(root.left == null && root.right == null)
           { ls.add(root.val);return;}
        solve(root.left, ls);
        ls.add(root.val);
        solve(root.right, ls);
    }
}