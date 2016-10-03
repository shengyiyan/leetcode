ListNode head;
Random random;

public Solution(ListNode head) {
    this.head = head;                
}

public int getRandom() {
    
    ListNode c = head;
    int r = c.val;
    for(int i=1;c.next != null;i++){
        
        c = c.next;
        if(randInt(i) == i) r = c.val;                        
    }
    
    return r;
}

private int randInt(int max) {
    return (int)(Math.random() * ((max) + 1));
}