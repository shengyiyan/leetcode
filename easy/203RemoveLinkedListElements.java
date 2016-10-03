    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode cur = head;
        ListNode pre = newHead;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return newHead.next;
    }