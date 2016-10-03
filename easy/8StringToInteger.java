public static int myAtoi(String str) {
    str = str.trim(); //trim whitespace
    if(str.length()<1 || str==null){
        return 0;
    }
    int sign = 1;
    int i = 0;
    double result = 0; //return value

    if(str.charAt(0) == '+'){
        i++;
    }
    else if(str.charAt(0) == '-'){
        i++;
        sign = -1;
    }
    //calculate the numerical value
    while(i<str.length() && Character.isDigit(str.charAt(i))){
        result = result*10 + str.charAt(i) - '0';
        i++;
    }

    if(sign == -1){
        result = sign*result;
    }
    //handle the overflow case
    if(result>Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
    }
    else if(result<Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
    }

    return (int)result;
}