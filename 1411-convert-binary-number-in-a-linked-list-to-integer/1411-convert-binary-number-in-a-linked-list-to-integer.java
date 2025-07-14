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
    public int getDecimalValue(ListNode head) {

        int length = 1;
        ListNode dummy = head;

        while(null != dummy.next)
        {
            length++;
            dummy = dummy.next;
        }

       // System.out.println(length);

       Integer result = 0;

       while(null != head)
        {  //System.out.println(head.val + " -- "+ length + " - " );
            Integer digit = (head.val == 1) ? (int) Math.pow(2,(length-1)) : 0;  
            //System.out.println( "digit : " + digit);
            result = result+ (digit);
            head = head.next;
            length--;
        }


        return result;


        
    }
}