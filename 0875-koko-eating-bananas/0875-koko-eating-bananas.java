class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = -1;
        for(int i = 0; i < piles.length; i++)
            max = Math.max(max, piles[i]);
        int low = 1;
        int high = max;
        int k = -1;
        while(low <= high) {
            int mid = (high + low)/2;
            long requiredHour  = 0;
            
            for(int i = 0; i < piles.length; i++)
                requiredHour += (long)(Math.ceil(piles[i]/(mid*1.0)));
            
            if(requiredHour <= h){
                k = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return k;
    }
}