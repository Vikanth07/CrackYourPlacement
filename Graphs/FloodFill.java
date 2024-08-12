package Graphs;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int iniColor = image[sr][sc];
        int[] delRow = {-1,0,+1,0};
        int[] delCol = {0,+1,0,-1};
        dfs(sr,sc,ans,image,iniColor,color,delRow,delCol);
        return ans;
    }
    public void dfs(int row, int col,int[][] ans, int[][] img, int iniColor, int newColor, int[] delRow, int[] delCol){
        ans[row][col]=newColor;
        int n = img.length;
        int m = img[0].length;
        for(int i=0; i<4; i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && img[nrow][ncol]==iniColor && ans[nrow][ncol]!=newColor){
                dfs(nrow,ncol,ans,img,iniColor,newColor,delRow,delCol);
            }
        }
    }
}
