class Solution {
    public int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n < 3)
            return 1;
            
      int prevToprevToprev = 0;
        int prevToprev = 1;
        int prev = 1;
        for(int i = 3; i <= n; i++){
            int current = prevToprevToprev + prevToprev + prev;
            prevToprevToprev = prevToprev;
            prevToprev = prev;
            prev = current;
        }
        return prev;
    }
}