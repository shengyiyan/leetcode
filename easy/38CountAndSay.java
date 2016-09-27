public String countAndSay(int n) {
    String s = "1";
    for(int i = 1; i<n; i++){
        int len = s.length();
        String temp = "";
        for(int j = 0; j<len; j++){
            int count = 1;
            while(j+1< len && s.charAt(j) == s.charAt(j+1)){
                j ++;
                count ++;
            }
            temp += count+s.substring(j,j+1);
        }
        s = temp;
    }
    return s;
}
//Use stringbuilder can make it faster