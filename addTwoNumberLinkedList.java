/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     long val;
 *     ListNode next;
 *     ListNode(long x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = 0;
        int sum = 0;
        int carry = 0;
        
        ListNode list = new ListNode(0);
        ListNode head = list;
        
        
        do{
                       
            sum = (l1 != null ? l1.val : 0 )+ (l2 != null ? l2.val : 0) + list.val;
            if (sum >= 10) {
                int quotient = sum %10;
                list.val = quotient;
                carry = 1;
            } else {
                list.val = sum;
                carry = 0;
            }
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            
            if(l1 != null || l2 !=null || carry != 0) {
            list.next = new ListNode(carry);    
            }
            
            list = list.next;
            
        } while (l1 !=null || l2 !=null);
        
        
        return head;
    }
}