//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer>ans=new ArrayList<Integer>();
    Arrays.sort(arr);
    boolean flag=false;
    for(int i=0;i<n-1;i++){
        if(arr[i]==arr[i+1]){
            if(i>0&&arr[i]==arr[i-1])continue;
            ans.add(arr[i]);
            flag=true;
        }
    }
    if(flag==false){
        ans.add(-1);
        return ans;
    }
    return ans;
    }
}