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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        if(len <= 1) return head;
        k = k % len;
        ListNode end = head;
        while(k > 0)
        {
            end = end.next;
            k--;
        }
        curr = head;
        while(end.next != null){
            curr = curr.next;
            end = end.next;
        }
        end.next = head;
        head = curr.next;
        curr.next = null;
        
        //System.out.println(k + " "+ len);
        return head;
    }
}