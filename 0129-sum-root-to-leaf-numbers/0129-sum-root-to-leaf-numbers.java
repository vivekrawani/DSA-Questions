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
    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        StringBuilder num = new StringBuilder();
        
        dfs(root, num, list);
        
        int sum = 0;
        
        for(Integer ele : list) 
            sum += ele;
        return sum;
    }
    
    void dfs(TreeNode root, StringBuilder num, List<Integer> list) {
        if(root == null) return;
        num.append(root.val);
        if(isLeaf(root)) {
           list.add(Integer.parseInt(num.toString()));
             num.deleteCharAt(num.length()-1);
            return;            
        }
        dfs(root.left, num, list);
        dfs(root.right, num, list);
        num.deleteCharAt(num.length()-1);
       
    }
    
    boolean isLeaf(TreeNode root) {
        return (root.left == null && root.right == null);
    }
}