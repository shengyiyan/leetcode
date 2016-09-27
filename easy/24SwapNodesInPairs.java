    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode res = new ListNode(0);
        ListNode pre = new ListNode(0);
        ListNode first = head;
        ListNode second = head.next;
        pre.next = first;
        res = pre;
        while (first != null && second != null) {
            first.next = second.next;
            pre.next = second;
            second.next = first;
            pre = first;
            if (first.next != null) {
                first = first.next;
            } else {
                break;
            }
            if (first.next != null) {
                second = first.next;
            } else {
                break;
            }
        }
        return res.next;
    }