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
        
        boolean isCircular = false;
        
        if(head == null || head.next == null) {
            return isCircular;
        }
        
        ListNode slowPointer = head; 
        ListNode fastPointer = head.next.next;
        
        while(fastPointer != null) {
            if(slowPointer == fastPointer) {
                isCircular = true;
                break;
            }
            
            if(fastPointer.next == null) break;
            
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;     
        }
        return isCircular;
    }
}