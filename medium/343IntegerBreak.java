public int integerBreak(int n) {
    int[] res = new int[57];
    res[0] = 1;
    res[1] = 2;
    res[2] = 4;
    res[3] = 6;
    res[4] = 9;
    for (int i = 5; i < 57; i++) {
        res[i] = res[i - 3] * 3;
    }
    return res[n - 2];
}