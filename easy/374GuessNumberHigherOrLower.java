public int guessNumber(int n) {
    int left = 1, right = n;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int ret = guess(mid);
        if (ret == 0) {
            return mid; 
        } else if (ret < 0) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    
    return -1;
}