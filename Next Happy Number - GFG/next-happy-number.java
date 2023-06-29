//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{

    static int nextHappy(int N){
        // code here
        int sum;
        int temp = N + 1;
        int i = N + 2;

        while (true) {
            sum = 0;
            int num = temp;

            while (num > 0) {
                int r = num % 10;
                sum += r * r;
                num = num / 10;
            }
            if (sum == 2 || sum == 4 || sum == 5) {
                temp = i;
                i++;
            } else if (sum == 1) {
                break;
            } else {
                temp = sum;
            }
        }

        return i - 1;
    }
}