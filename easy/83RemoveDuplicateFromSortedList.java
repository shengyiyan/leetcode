public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return head;
    if (head.next == null) return head;
    ListNode pre = head;
    ListNode cur = head.next;
    while (cur != null) {
        if (cur.val == pre.val) {
            pre.next = cur.next;
            cur = cur.next;
        } else {
            pre = cur;
            cur = cur.next;
        }
    }
    return head;
}