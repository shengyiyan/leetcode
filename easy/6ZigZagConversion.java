    public static String convert(String s, int numRows) {
        ArrayList<Character>[] list = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            list[i] = new ArrayList<Character>();
        }

        int length = 0 , i = 0, j = 0;
        if (s.length() == 0) return s;
        
        while (length < s.length()) {
            //System.out.println("i = "+i +" j = "+j + s.charAt(length));
            if (j % 2 == 0) {
                list[i].add(s.charAt(length));
                length++;
                i++;
                if (i == numRows) {
                    i = 0;
                    j++;
                }
                
            } else {
                if (numRows == 2) {
                    list[i].add(s.charAt(length));
                    length++;
                    i++;
                    if (i == numRows) {
                        i = 0;
                        j++;
                    }
                } else {
                    if (i == 0 || i == numRows - 1) {
                        list[numRows - 1 - i].add(null);
                        i++;
                    } else {
                        list[numRows - 1 - i].add(s.charAt(length));
                        length++;
                        i++;
                    }
                    if (i == numRows) {
                        i = 0;
                        j++;
                    }
                }
                
            }
        }
        StringBuilder back = new StringBuilder();
        for ( int k = 0; k < numRows; k++) {
            for (int m = 0; m < list[k].size(); m++) {
                if (list[k].get(m)!=null) {
                    back.append(list[k].get(m));
                }
            }
        }
        return back.toString();
    }