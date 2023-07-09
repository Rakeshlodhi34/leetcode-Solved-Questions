//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:arr){
            set.add(i);
        }
        int c=1;
        for(int i=0;i<size;i++){
            if(set.contains(c)){
                c++;
            }else{
                return c;
            }
        }
        // Arrays.sort(arr);
        // int c=1;
        // for(int i=0;i<size;i++){
        //     if(arr[i]>0){
        //         if(arr[i]!=c&&arr[i]!=arr[i-1]){
        //             return c;
        //         }
        //         c++;
        //     }
        // }
        return arr[size-1]+1;
    }
}

//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends