/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> node = new ArrayList<>();
        ListNode itr = head;
        while(itr!=null){
            node.add(itr.val);
            itr = itr.next;
        }
        int l = 0;
        int r = node.size()-1;
        return solve(l,r,node);
    }
     private static TreeNode solve(int left, int right, List<Integer> nums){
        if(left > right)
            return null;
        int mid = (left + right)/2;
        
        TreeNode node = new TreeNode(nums.get(mid));
        node.left = solve(left, mid - 1, nums);
        node.right = solve(mid+1, right, nums);
        return node;
    }
    
}