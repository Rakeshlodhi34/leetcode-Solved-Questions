//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return -1;
        }
        
        int[] f = new int[26]; 
        
        int Count = 0;
        int max = -1;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            
            if (f[rightChar - 'a'] == 0) {
                Count++;
            }
           f[rightChar - 'a']++;
            
            while (Count > k) {
                char leftChar = s.charAt(left);
              f[leftChar - 'a']--;
                
                if (f[leftChar - 'a'] == 0) {
                    Count--;
                }
                
                left++;
            }
            
            if (Count == k) {
                max = Math.max(max, right - left + 1);
            }
        }
        
        return max;
    }
}