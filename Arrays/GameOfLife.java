package Arrays;

public class GameOfLife {
    public boolean isValid(int x, int y, int[][] board){
        return (x>=0 && x<board.length) && (y>=0 && y<board[0].length);
    }
    public void gameOfLife(int[][] board) {
        int[] dx={0,1,1,1,0,-1,-1,-1};
        int[] dy={1,1,0,-1,-1,-1,0,1};
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                int cntLiveNeighbors=0;
                for(int k=0; k<8; k++){
                    int curr_x=row+dx[k];
                    int curr_y=col+dy[k];
                    if(isValid(curr_x,curr_y,board) && Math.abs(board[curr_x][curr_y])==1){
                        cntLiveNeighbors++;
                    }
                }
                if(board[row][col]==1 && (cntLiveNeighbors<2 || cntLiveNeighbors>3)){
                    board[row][col]=-1;
                }
                if(board[row][col]==0 && cntLiveNeighbors==3){
                    board[row][col]=2;
                }
            }
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]>=1){
                    board[i][j]=1;
                }else{
                    board[i][j]=0;
                }
            }
        }
    }
}
