public ListNode reverseList(ListNode head) {
    if (head == null) return null;
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = head;
    while (cur.next != null) {
        ListNode temp = dummy.next;
        dummy.next = cur.next;
        cur.next = cur.next.next;
        dummy.next.next = temp;
    }
    return dummy.next;
}