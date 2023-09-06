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
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            Solution obj = new Solution();
            int ans = obj.findMotherVertex(V, adj);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends






class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj) {

        int[] vis = new int[V];
        int v = 0;
        for(int i = 0 ; i < V ; i++ ) {
            if(vis[i] == 0) {
                v = i;
                dfs(i, adj,vis);
            }
        }
        vis = new int[V];
        dfs(v, adj, vis);
        for(int i = 0 ; i < V ; i++) if(vis[i] == 0) return -1;
        return v;
    }

    private void dfs(int i, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[i] = 1;
        for(int c : adj.get(i)) {
            if(vis[c] == 0) dfs(c, adj, vis);
        }
    }
}