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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        if(head == null) return false;
        while(true){
            if(slow.next != null) slow = slow.next;
            if(head.next != null && head.next.next != null) head = head.next.next;
            else break;   
            if(slow == head) return true;
        }
        return false;
    }
}