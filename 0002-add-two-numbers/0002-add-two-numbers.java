class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // dummy head to simplify edge cases
        ListNode dummy = new ListNode(0);
        ListNode curr  = dummy;
        int carry = 0;

        // loop while either list has nodes or there’s a carry to process
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            int sum = x + y + carry;
            carry = sum / 10;
            
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
