public int firstUniqChar(String s) {
    int[] array = new int[26];
    char[] ch = s.toCharArray();
    for (int i = 0; i < ch.length; i++) {
        array[ch[i] - 'a'] += 1;
    }
    for (int i = 0; i < ch.length; i++) {
        if (array[ch[i] - 'a'] == 1) {
            return i;
        }
    }
    
    return -1;
}