class Solution {
    public int climbStairs(int n) {
        // f(n) = f(n-1) + f(n-2);
        int memo[] = new int[n+1];
        for(int i = 0; i <= n; i++){
            memo[i] = -1;
        }
        memo[0] = memo[1] = 1;
        for(int i = 2; i <= n; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
       // return climbStair(n, memo);
        
        return memo[n];
       
    }
    private int climbStair(int n, int[] memo){
        if(n < 0)
            return 0;
        if( n == 0 || n == 1)
        {
            memo[n] = 1;
        }
        
        if(memo[n] != -1)
            return memo[n];
        
        int oneStep =  climbStair(n-1, memo);
        int twoSteps =  climbStair(n-2, memo);
        memo[n] = oneStep + twoSteps;
        return memo[n];
    }
}