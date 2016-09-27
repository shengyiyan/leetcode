public boolean isHappy(int n) {
    if (n == 1) return true;
    HashSet<Integer> happy = new HashSet<Integer>();
    n = getSum(n);
   // System.out.println(n);
    if (n == 1) {
        return true;
    }
    while(!happy.contains(n)) {
        happy.add(n);
        n = getSum(n);
       // System.out.println(n);
        if (n == 1) {
            return true;
        }
    }
    return false;
}
private int getSum(int n) {
    int sum = 0;
    while (n / 10 > 0) {
        int digit = n % 10;
        sum += digit * digit;
        n = n/10;
    }
    sum += n*n;
    return sum;
}