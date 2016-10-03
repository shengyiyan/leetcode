    public String addBinary(String a, String b) {
        char[] ar = a.toCharArray();
        char[] br = b.toCharArray();
        char[] res = new char[Math.max(ar.length, br.length)+1];
        
        char pre = '0';
        int i = ar.length-1, j = br.length-1, k = res.length-1;
        while (i >= 0 && j >= 0) {
            int tmp = ((ar[i]-'0')+(br[j]-'0')+(pre-'0'))/2;
            res[k] = (char)(((ar[i]-'0')+(br[j]-'0')+(pre-'0'))%2 + '0');
            pre = (char)(tmp + '0');
            --i; --j; --k;
        }
        while (i >= 0) {
            int tmp = ((ar[i]-'0')+(pre-'0'))/2;
            res[k] = (char)(((ar[i]-'0')+(pre-'0'))%2 + '0');
            pre = (char)(tmp + '0');
            --i; --k;            
        }
        while (j >= 0) {
            int tmp = ((br[j]-'0')+(pre-'0'))/2;
            res[k] = (char)(((br[j]-'0')+(pre-'0'))%2 + '0');
            pre = (char)(tmp + '0');
            --j; --k;                  
        }
        if (pre != '0') { res[0] = '1'; return String.valueOf(res); }
        else return String.valueOf(Arrays.copyOfRange(res, 1, res.length));
    }