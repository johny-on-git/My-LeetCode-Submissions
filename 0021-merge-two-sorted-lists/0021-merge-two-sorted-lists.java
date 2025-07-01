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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyNode = new ListNode(0);
        ListNode runnerNode = dummyNode;

        while(list1 !=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                runnerNode.next = list1;
                list1=list1.next;
            }else
            {
               runnerNode.next = list2;
                list2=list2.next;
            }
            runnerNode = runnerNode.next;
        }

        if(list1!=null)
            runnerNode.next = list1;
        else
            runnerNode.next = list2;

          return dummyNode.next;  
        
        
    }
}