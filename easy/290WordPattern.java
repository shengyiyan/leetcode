public boolean wordPattern(String pattern, String str) {
    String[] givenString = str.split(" ");
    HashMap <Character,String> hmap = new HashMap<Character,String>();
    char[] ch = pattern.toCharArray();
    if(ch.length != givenString.length){
        return false;
    }
    for(int i=0;i<ch.length;i++){
        if(!(hmap.containsKey(ch[i]))){
            if(hmap.containsValue(givenString[i])){
                return false;
            }
            hmap.put(ch[i],givenString[i]);
        }else{
            if(!(hmap.get(ch[i]).equals(givenString[i]))){
                return false;
            }
        }
    }
    return true;
}