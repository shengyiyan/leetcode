public int countPrimes(int n) {
    boolean[] a = new boolean[n];
    int result = 0;
    for (int i = 2; i < n; i++)
        if (!a[i]) {
            for (int j = 2 * i; j < n; j += i)
                a[j] = true;
            result++;
        }
    return result;
}