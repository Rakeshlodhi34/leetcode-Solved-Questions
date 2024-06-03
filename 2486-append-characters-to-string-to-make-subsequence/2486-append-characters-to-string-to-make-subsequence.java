class Solution {
    public int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0, j=0;
        for(i=0;i<n&& j<m;i++){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
        }
               return m-j;
    }
}