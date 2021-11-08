class Solution {
    public int nthUglyNumber(int n) {
int[] dp = new int[n];
        int p1 = 0, p2= 0,p3 = 0;
        dp[0] = 1; //  base case
        for(int i = 1 ; i<n; i ++)
        {
            dp[i] = Math.min(Math.min(dp[p1]*2,dp[p2]*3),dp[p3]*5);
            p1 = (dp[i] == dp[p1]*2)?p1+1:p1;
            p2 = (dp[i] == dp[p2]*3)?p2+1:p2;
            p3 = (dp[i] == dp[p3]*5)?p3+1: p3;
        }
        return dp[n-1];
    }
}
