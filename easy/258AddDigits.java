public int addDigits(int num) {
    if (num / 10 == 0) return num;
    int sum = 0;
    while (num >= 10) {
        sum += num % 10;
        num = num / 10;
    }
    sum += num;
    return addDigits(sum);
}