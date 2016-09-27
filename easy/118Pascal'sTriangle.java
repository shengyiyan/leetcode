public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (numRows == 0) return result;
    List<Integer> firstRow = new ArrayList<Integer>();
    firstRow.add(1);
    result.add(firstRow);
    if (numRows == 1) return result;
    for (int i = 2; i <= numRows; i++) {
        List<Integer> thisRow = new ArrayList<Integer>();
        for (int j = 0; j < i; j++) {
            if (j == 0 || j == i - 1) {
                thisRow.add(1);
            } else {
                //System.out.println(result.get(0));
                //System.out.println(result.get(1));
                int left = result.get(i - 2).get(j - 1);
                int right = result.get(i - 2).get(j);
                thisRow.add(left + right);
            }
        }
        result.add(thisRow);
    }
    return result;
}