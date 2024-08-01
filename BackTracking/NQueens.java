package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public void findPosQueens(char[][] board, int row, List<List<String>> lst){
        if(row==board.length){
            printBoard(board,lst);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                findPosQueens(board,row+1,lst);
                board[row][j]='.';
            }
        }
    }
    public void printBoard(char[][] board,List<List<String>> lst){
        List<String> l =new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    s+="Q";
                }else{
                    s+=".";    
                }
            }
            l.add(s);
        }
        lst.add(l);
    }
    public boolean isSafe(char[][] board, int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lst = new ArrayList<>();
        char[][] board=new char[n][n];
        findPosQueens(board,0,lst);
        return lst;
    }
}
