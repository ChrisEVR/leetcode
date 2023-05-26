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
    public boolean isPalindrome(ListNode head) {
        Stack<Byte> stack = new Stack<>();
        ListNode aux = head;

        while(aux != null){
            stack.push((byte)aux.val);
            aux = aux.next;
        }

        while(head != null){
            if(head.val != stack.pop()) return false;
            head = head.next;
        }

        return true;
    }
}