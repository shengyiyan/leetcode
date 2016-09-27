public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode right = new ListNode(0);
    ListNode left = new ListNode(0);
    ListNode leftP = new ListNode(0);
    right = head;
    left = head;
    leftP = null;
    while (n > 1) {
        right = right.next;
        n--;
    }
    while (right.next != null) {
        right = right.next;
        leftP = left;
        left = left.next;
    }
    if (left == head) head = head.next;
    else {
        leftP.next = left.next;
    }
    return head;
 }