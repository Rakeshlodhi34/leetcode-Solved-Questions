// class Solution {
//     public void reverseString(char[] s) {
//         StringBuilder sb = new StringBuilder();
//         sb.append(s);
//         sb.reverse();
        
//         for (int i = 0; i < s.length; i++) {
//             s[i] = sb.charAt(i);
//         }
//     }
// }
class Solution {
    public void reverseString(char[] s) {
        // // char[] ans = new char[s.length];
        // int left = 0;
        // int right = s.length - 1;

        // while(left < right) {
        //     char temp = s[left];
        //     s[left] = s[right];
        //     s[right] = temp;

        //     left++;
        //     right--;
        // }
        // for(int i = 0; i < s.length; i++) {
        //     System.out.print(s[i]);
        // }


















        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
    }
}
