public boolean isSubsequence(String s, String t) {
    int m = s.length(), n = t.length();
    boolean preUp = true;
    boolean[]dp = new boolean[m+1];
    dp[0] = true;
    for(int j = 1; j <=n; j++){
        preUp = true;
        for(int i = 1; i <= m; i++){
            boolean tmp = dp[i];
            if(s.charAt(i-1) == t.charAt(j-1)){
                dp[i] = preUp||dp[i];
            }
            preUp = tmp;
        }
        if(dp[m]) return true;
    }
    return dp[m];
}