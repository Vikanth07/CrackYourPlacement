package BackTracking;

public class SudokuSolver {
    public boolean sudokuSolver(char[][] board, int row, int col){
        if(row==9){
            return true;
        }
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }

        if(board[row][col]!='.'){
            return sudokuSolver(board,nextRow,nextCol);
        }

        for(char digit='1';digit<='9';digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=digit;
                if(sudokuSolver(board,row,col)){
                    return true;
                }
                board[row][col]='.';
            }
        }

        return false;
    }

    public boolean isSafe(char[][] board,int row, int col, char digit){
        for(int i=0;i<9;i++){
            if(board[i][col]==digit){
                return false;
            }
        }

        for(int j=0;j<9;j++){
            if(board[row][j]==digit){
                return false;
            }
        }

        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }
    public void solveSudoku(char[][] board) {
        sudokuSolver(board,0,0);
    }
}
