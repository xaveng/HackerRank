/**
 * Definition for singly-linked list.
 * <pre>
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * </pre>
 */
public class Solution {

    ListNode reverse(ListNode list) {
        ListNode prev = null;
        ListNode curr = list;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);

        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;
        while (r1 != null || r2 != null) {
            int sum = (r1 != null ? r1.val : 0)
                    + (r2 != null ? r2.val : 0)
                    + carry;
            carry = sum / 10;
            sum = sum % 10;
            curr.next = new ListNode(sum);
            curr = curr.next;

            if (r1 != null) r1 = r1.next;
            if (r2 != null) r2 = r2.next;
        }
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        return reverse(result.next);
    }
}