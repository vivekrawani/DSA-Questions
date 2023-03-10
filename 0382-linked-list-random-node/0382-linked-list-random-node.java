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
class Solution {
    List<Integer> ls;
    public Solution(ListNode head) {
        ls = new ArrayList<>();
        ListNode cur = head;
        while(cur!=null)
        {
            ls.add(cur.val);
            cur = cur.next;
        }
    }
    
    public int getRandom() {
        int max = ls.size()-1;
        int min = 0;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        return ls.get(rand);
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */