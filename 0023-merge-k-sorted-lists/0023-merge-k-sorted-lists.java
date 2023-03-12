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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> q =  new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            ListNode itr = lists[i];
            while(itr!=null)
            {
                q.offer(itr.val);
                itr = itr.next;
                
            }
        }
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(!q.isEmpty()){
            tail.next = new ListNode(q.poll());
            tail = tail.next;
        }
        return dummy.next;
    }
}