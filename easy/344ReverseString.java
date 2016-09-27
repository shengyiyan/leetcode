public String reverseString(String s) {
    char[] S = s.toCharArray();
    int left = 0, right = S.length - 1;
    while (left <= right) {
        char temp = S[left];
        S[left] = S[right];
        S[right] = temp;
        left++;
        right--;
    }
    StringBuilder res = new StringBuilder();
    for (char character: S) {
        res.append(character);
    }
    return res.toString();
}