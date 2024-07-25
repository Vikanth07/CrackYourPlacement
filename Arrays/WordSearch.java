package Arrays;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(word.charAt(0)==board[i][j]){
                    if(helper(board, word, i, j, n, m, 0))return true;
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word, int i, int j, int n, int m, int k){
        if(k==word.length())return true;
        if(i<0 || i>=n || j<0 || j>=m || board[i][j]=='.' || word.charAt(k)!=board[i][j])return false;
        if(word.length()==1 && word.charAt(k)==board[i][j])return true;
        board[i][j]='.';
        boolean temp=false;
        int[] dx = {0,1,0,-1};
        int[] dy = {-1, 0, 1, 0};
        for(int idx=0; idx<4; idx++){
            temp = temp || helper(board, word, i+dx[idx], j+dy[idx], n, m, k+1);
        }
        board[i][j]=word.charAt(k);
        return temp;
    }
}
