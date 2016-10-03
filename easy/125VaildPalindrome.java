    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        s = s.toLowerCase();
        System.out.println(s);
        char[] res = s.toCharArray();
        int len = res.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            while (!isC(res[left]) && left < len - 1) left++;
            while (!isC(res[right]) && right > 0) right--;
            if (!isC(res[left]) && !isC(res[right]) || res[left] == res[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    private boolean isC(char a) {
        if (a >= 'a' && a <= 'z' || a >= '0' && a <= '9') {
            return true;
        } else {
            return false;
        }
    }