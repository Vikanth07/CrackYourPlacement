package Matrix;

import java.util.Arrays;

public class RotateImage {
     public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean ans[][] = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==j)continue;
                if(ans[i][j]==false){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                    ans[i][j]=true;
                    ans[j][i]=true;
                } 
            }
        }
        for(int i=0; i<m ;i++){
            Arrays.fill(ans[i],false);
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n/2; j++){
                if(ans[i][j]==false){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[i][n-j-1];
                    matrix[i][n-j-1]=temp;
                    ans[i][j]=true;
                    ans[i][n-j-1]=true;
                }
            }
        }
    }
}
