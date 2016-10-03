public String convertToTitle(int n) {
    StringBuilder res = new StringBuilder();
    if (n < 1) return res.toString();

    do {
        int tmp = --n % 26;
        res.insert(0, (char) ('A'+tmp));
        n /= 26;
    } while (n > 0);
   
    return res.toString();
}