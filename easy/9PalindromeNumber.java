    public boolean isPalindrome(int x) {
            if (x<0 || (x!=0 && x%10==0)) return false;
    int rev = 0;
    while (x>rev){
    	rev = rev*10 + x%10;
    	x = x/10;
    }
    return (x==rev || x==rev/10);
    /*
        if (x < 0) return false;
        int temp = x;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (temp >= 10) {
            list.add(temp % 10);
            temp = temp / 10;
        }
        list.add(temp);
        for (int i = 0; i < list.size() / 2 + 1; i++) {
            if (list.get(i) != list.get(list.size() - 1 - i)) return false;
        }
        return true;
        */
    }   