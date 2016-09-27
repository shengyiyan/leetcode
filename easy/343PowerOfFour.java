public boolean isPowerOfFour(int n) {
    int x = (int)Math.sqrt(n);
    return(n > 0 && 1073741824 % n == 0 && x*x == n);
}