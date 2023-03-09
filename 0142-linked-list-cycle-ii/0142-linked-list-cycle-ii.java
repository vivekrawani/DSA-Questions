/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> st =  new HashSet<>();
        if(head == null) return null;
        if(head.next == null) return null;
        ListNode itr = head;
        while(itr!=null)
        {
            if(st.contains(itr))
                return itr;
            st.add(itr);
            itr = itr.next;
        }
        return itr;
    }
}