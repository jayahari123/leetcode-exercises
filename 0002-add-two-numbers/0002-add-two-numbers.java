class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        int pas = 0;
        ListNode res = new ListNode(0), temp = res;
        while (l1 != null || l2 != null || pas != 0) {
            int in1 = (l1 != null) ? l1.val : 0;
            int in2 = (l2 != null) ? l2.val : 0;

            int cur = in1 + in2 + pas;
            pas = cur / 10;

            temp.next = new ListNode(cur % 10);
            temp = temp.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return res.next;
    }}