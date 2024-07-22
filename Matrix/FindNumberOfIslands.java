package Matrix;

public class FindNumberOfIslands {
    public int numIslands(char[][] grid) {
        // Code here
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
    public void dfs(int row, int col, char[][] grid){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        
        dfs(row+1,col,grid);
        dfs(row-1,col,grid);
        dfs(row,col+1,grid);
        dfs(row,col-1,grid);
        dfs(row-1,col+1,grid);
        dfs(row-1,col-1,grid);
        dfs(row+1,col+1,grid);
        dfs(row+1,col-1,grid);
    }
}
