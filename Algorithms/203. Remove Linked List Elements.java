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
    public ListNode removeElements(ListNode head, int val) {
        ListNode auxHead = head;

        while(auxHead != null){

            if(auxHead.val == val){
                head = auxHead.next;
                auxHead.next = null;
                auxHead = head;
            } else break;
        }

        auxHead = head;

        while(auxHead != null){
            if(auxHead.next != null && auxHead.next.val == val) auxHead.next = auxHead.next.next;
            else auxHead = auxHead.next;
        }

        return head;
    }
}