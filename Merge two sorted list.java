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
        
         if(l1 == null && l2!= null) {
                return l2;
            }
            
            if(l1 != null && l2 == null) {
                return l1;
            }
                     
        ListNode temp = null;
        ListNode head = null;
        while(l1 != null || l2 != null) {
             if(l1 != null && l2 != null) { 
                 if(l1.val <= l2.val) {
                     if(temp == null) {
                        temp = l1;   
                        head = temp;
                     } else {
                         temp.next = l1;
                         temp = l1;
                     }
                     l1 = l1.next; 
                 } else {
                      if(temp == null) {
                        temp = l2;  
                         head = temp; 
                     } else {
                         temp.next = l2;
                         temp = l2;
                     }
                     l2 = l2.next; 
                 }
             }
            if(l1 == null && l2!= null) {
                temp.next = l2;
                break;
            }
            
            if(l1 != null && l2 == null) {
                temp.next = l1;
                break;
            }
            
        }
        
        return head;
        
        
    }
}