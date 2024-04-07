class Solution {
    public long countSubstrings(String s, char c) {
        long count=0;
        char[] ch=s.toCharArray();
        if(s.isEmpty()){
            return count;
        }
        for(int i=0;i<s.length();i++){
            if(ch[i]==c){
                count++;
            }
        }
       long result=count*(count+1)/2;
      
          return result;
    }
}