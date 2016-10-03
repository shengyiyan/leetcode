public static int reverse(int x) {
    int flag = 1;
    if(x >= 2147483647) return 0;
    if(x <= -2147483648) return 0;
    double back = 0;
    int abs = Math.abs(x);
    if (x == 0) return 0;
    if (x < 0) flag = -1;
    if (abs < 10) return abs * flag;
    back = abs % 10;
    abs = abs / 10;
    while (abs >= 10) {
        back = back * 10 + abs % 10;
        abs = abs / 10;
    }
    back = back * 10 + abs;
    if(back * flag >= 2147483647) return 0;
    if(back * flag <= -2147483648) return 0;
    return (int)back * flag;
}