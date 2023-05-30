//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends



class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        int n=board.length,m=board[0].length;
        char start=word.charAt(0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==start){
                    if(dfs(i,j,board,word,0))return true;
                }
            }
        }
        return false;
    }
    boolean dfs(int i,int j,char[][] board,String word,int ind){
        // outof bound cases
        if(i<0 || i>=board.length || j<0 || j>=board[0].length)return false;
        if(ind>=word.length())return true;
        
        boolean res=false;
        if(board[i][j]==word.charAt(ind)){
            board[i][j]='-';
            res=(dfs(i+1,j,board,word,ind+1) ||
                 dfs(i-1,j,board,word,ind+1) ||
                 dfs(i,j+1,board,word,ind+1) ||
                 dfs(i,j-1,board,word,ind+1)
                );
                board[i][j]=word.charAt(ind);
        }
        return res;
    }
}