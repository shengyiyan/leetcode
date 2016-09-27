public String getHint(String secret, String guess) {
    int[] map = new int[10];
    int a = 0, b = 0;
    char[] s = secret.toCharArray();
    char[] g = guess.toCharArray();
    for (int i = 0; i < s.length; i++) {
        if (s[i] == g[i]) a++;
        else {
            if (++map[s[i] - '0'] <= 0) b++;
            if (--map[g[i] - '0'] >= 0) b++;
        }
    }
    return a + "A" + b + "B";
}