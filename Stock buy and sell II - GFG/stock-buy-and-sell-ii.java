//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] prices = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.stockBuyAndSell(n, prices);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends






class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        //int min = Integer.MAX_VALUE;
        int ans = 0;
        //boolean flag = true;
        int i = 0 , j = 1;
        while(i<n && j<n){
            if(prices[j] > prices[i]){
                int max = prices[j];
                 while( j<n && prices[j] >= max){
                 max = Math.max(prices[j],max);
                 j++;
            }
            ans += max - prices[i];
            }
           i = j;
           j++;
        }
        return ans;
    }
}
        
        
