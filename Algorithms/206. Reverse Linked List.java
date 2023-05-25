import java.util.Stack;

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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode res = null, auxNode = null;
        
        if(head == null) return res;
        
        do{
            stack.push(head.val);
            head = head.next;
        }while(head != null);
        
        res = new ListNode(stack.pop());
        if(stack.empty()) return res;
        auxNode = new ListNode(stack.pop());
        res.next = auxNode;
        
        while(!stack.empty()){
            auxNode.next = new ListNode(stack.pop());
            auxNode = auxNode.next;
        }
        
        return res;
    }
}