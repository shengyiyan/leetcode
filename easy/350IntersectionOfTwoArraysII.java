public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> temp = new ArrayList<Integer>();
    for (int num : nums1)
        map.put(num, map.getOrDefault(num, 0)+1);
    for (int num : nums2){
        if (map.containsKey(num) && map.get(num) > 0){
            temp.add(num);
            map.put(num, map.get(num)-1);
        }
    }
    int[] res = new int[temp.size()];
    for (int i = 0; i < temp.size(); i++)
        res[i] = temp.get(i);
    return res;
}