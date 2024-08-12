package Graphs;

import java.util.ArrayList;

public class RatMaze {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        int m = mat.length;
        boolean vis[][] = new boolean[m][m];
        helper(0,0,m,vis,"",ans,mat);
        return ans;
    }
    public void helper(int i,int j,int n, boolean[][] vis, String s, ArrayList<String> ans,int[][] mat){
        if(i<0 || i>=n || j<0 || j>=n){
            return;
        }
        if(mat[i][j]==0 || vis[i][j]==true){
            return;
        }
        if(i==n-1 && j==n-1){
            ans.add(s);
            return;
        }
        vis[i][j]=true;
        helper(i,j+1,n,vis,s+"R",ans,mat);
        helper(i+1,j,n,vis,s+"D",ans,mat);
        helper(i-1,j,n,vis,s+"U",ans,mat);
        helper(i,j-1,n,vis,s+"L",ans,mat);
        vis[i][j]=false;
    }
}
