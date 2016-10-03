public int integerReplacement(int n) {
    if(n==2147483647) return Math.min(2+integerReplacement(1073741824), 2 + integerReplacement(1073741823));
    if (n == 1) return 0;
    if (n % 2 == 0) return 1 + integerReplacement(n / 2);
    return Math.min(1 + integerReplacement(n - 1), 1 + integerReplacement(n + 1));
}