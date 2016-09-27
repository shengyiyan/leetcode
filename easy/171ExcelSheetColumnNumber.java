public int titleToNumber(String s) {
    int value = 0;
    for(int i = 0; i < s.length(); i++)
        value = value * 26 + ((int)s.charAt(i) - 'A') + 1;
    return value;
}