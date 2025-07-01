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
  public ListNode removeNthFromEnd(ListNode head, int n) {

        Integer length = getLengthOfLinkedList(head);

        if(length ==  n )
        {
            return head.next;
        }

        Integer nodeRemovePos = length - n;


       
        ListNode nodeR=head;
        ListNode prev=null;

        Integer count =1;

        while(count <= nodeRemovePos && nodeR.next !=null)
        {
            prev = nodeR;
            nodeR=nodeR.next;
            //System.out.println(prev.val + " -> "+nodeR.val);
            count++;
        }
      //  System.out.println(prev.val + " -> "+nodeR.val);
        prev.next = nodeR.next;

        return head;
    
    }

    public Integer getLengthOfLinkedList(ListNode head)
    {
        Integer length=1;
        while(head.next != null)
        {
            length++;
            head=head.next;
        }
        return length;
    }
}