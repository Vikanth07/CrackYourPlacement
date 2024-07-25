package DynamicProgramming;

public class LongestCommonSubstring {
    int longestCommonSubstr(String S1, String S2, int n, int m){
        int[][] dp = new int[S1.length()+1][S2.length()+1];
        int ans=0;
        for(int j=1; j<=S1.length(); j++){
            for(int i=1; i<=S2.length(); i++){
                if(S1.charAt(j-1)==S2.charAt(i-1)){
                    dp[j][i]=1+dp[j-1][i-1];
                    ans=Math.max(ans, dp[j][i]);
                }else{
                    dp[j][i]=0;
                }
            }
        }
        return ans;
    }
}
