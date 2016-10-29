import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private static ListNode makeList(int... values) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        for(int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return result.next;
    }

    @Test
    public void testMakeList() {
        Assert.assertEquals(makeList(1, 2, 3, 4).toString(), "1 -> 2 -> 3 -> 4");
    }



    @Test
    public void testReverse() {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        Assert.assertEquals(solution.reverse(l1).toString(), "4 -> 3 -> 2 -> 1");
    }

    @Test
    public void testAddTwoNumebers() {
        Solution solution = new Solution();
        System.out.println(solution.addTwoNumbers(makeList(1, 2, 3, 4), makeList(1, 2, 3, 4)));
    }
}
