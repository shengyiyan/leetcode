    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() == 0 ) return 0;
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return len - 1 - i;
            }
        }
        return len;
    }