public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (Integer number : nums) {
        if (map.get(number) == null) {
            map.put(number, 1);
        } else {
            return true;
        }
    }
    return false;
}