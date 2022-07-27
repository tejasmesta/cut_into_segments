import java.util.*;

public class Solution {
    public static int cutSegments(int n, int x, int y, int z) {
        // Write your code here.
        int dp[] = new int[n+1];
        
        Arrays.fill(dp,Integer.MIN_VALUE);
        
        dp[0] = 0;
        
        for(int i=1;i<=n;i++)
        {
            if(i-x>=0)
                dp[i] = Math.max(dp[i],dp[i-x]+1);
            if(i-y>=0)
                dp[i] = Math.max(dp[i],dp[i-y]+1);
            if(i-z>=0)
                dp[i] = Math.max(dp[i],dp[i-z]+1);
        }
        
        if(dp[n]<=0)
        {
            return  0;
        }
        
        
        return dp[n];
    }
}
