public List<Integer> getRow(int rowIndex) {
    int k = rowIndex+1;
    int[] con = new int[k];
    con[0]=1;
    for(int i=1;i<k;i++){
        con[i]=1;
        for(int j=i-1;j>0;j--){
            con[j]=con[j-1]+con[j];
        }
    }
    List<Integer> list = new ArrayList<>();
    for(int kk:con) list.add(kk);
    return list;
}