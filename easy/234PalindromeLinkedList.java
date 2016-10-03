    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode slow = head, fast = head;
        ListNode cur  = head, rev  = null;

        //Finding mid point with fast slow, while also reversing first half
        while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           
           cur.next = rev;
           rev = cur;
           cur = slow;
        } 
        
        // Watch out for odd palindrome
        if(fast!=null) slow = slow.next;
     
        // Check palindrome
        while(rev != null ){
            if(rev.val != slow.val) return false;
            rev  = rev.next;
            slow = slow.next;
        }
        
        return true;
    }