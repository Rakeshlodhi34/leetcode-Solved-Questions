//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends


class Solution {
    public static String kthPermutation(int N,int K) {
   
    List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            nums.add(i);
        }
        
        StringBuilder sb = new StringBuilder();
        int[] factorial = new int[N + 1];
        calculateFactorial(factorial);
        
        findKthPermutation(nums, K, factorial, sb);
        
        return sb.toString();
    }
    private static void calculateFactorial(int[] factorial) {
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }
    
    private static void findKthPermutation(List<Integer> nums, int K, int[] factorial, StringBuilder sb) {
        if (nums.isEmpty()) {
            return;
        }
        
        int n = nums.size();
        int groupSize = factorial[n - 1];
        int selectedGroup = (K - 1) / groupSize;
        int selectedNum = nums.get(selectedGroup);
        
        sb.append(selectedNum);
        nums.remove(selectedGroup);
        
        int newK = K - (selectedGroup * groupSize);
        findKthPermutation(nums, newK, factorial, sb);
}  
    
}
 
     


//{ Driver Code Starts.

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
            
            int[] a = IntArray.input(br, 2);
            
            Solution obj = new Solution();
            String res = obj.kthPermutation(a[0],a[1]);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends