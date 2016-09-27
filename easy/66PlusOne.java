public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i] += 1;
            return digits;
        } else {
            if (i != 0) {
                digits[i] = 0;
            } else {
                digits[i] = 0;
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for (int j = 1; j< result.length; j++) {
                    result[j] = digits[j - 1];
                }
                return result;
            }
        }
    }
    return digits;
}