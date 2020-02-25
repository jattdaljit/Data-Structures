/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
                     
        ListNode list = new ListNode(0);
        ListNode head = list;
        
        do{
            if(l1 != null && l2 != null) {
                if(l1.val <= l2.val) {
                    list.val = l1.val;
                    l1 = l1.next;
                } else {
                    list.val = l2.val;
                    l2 = l2.next;
                }
            } else if( l1 != null && l2 == null) {
                list.val = l1.val;
                    l1 = l1.next;
            } else if( l1 == null && l2 != null) {
                  list.val = l2.val;
                    l2 = l2.next;
            } else {
                return l1;
            }
            
            if (l1!= null || l2!= null) {
                ListNode temp = new ListNode(0);
                list.next = temp;
                list = list.next;
            }
        } while( l1 !=null || l2 != null);
        
        return head;
        
        
    }
}