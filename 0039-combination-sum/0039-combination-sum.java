class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> subList = new ArrayList<>();
        //Collections.sort(A);
        
        solve(0, 0, candidates, target, subList, res);
        
        return res;
    }
    void solve(int sum, int index,int[] candidates, int target,
                      List<Integer> subList, List<List<Integer>> res)
    {
        if(sum > target) return;
        if(index == candidates.length) 
        {
             if(sum == target)
            {
                res.add(new ArrayList<Integer>(subList));
            }
            return;
            
        }
        if(sum == target)
        {
            res.add(new ArrayList<Integer>(subList));
            return;
        }
        
        sum += candidates[index];
        subList.add(candidates[index]);
        solve(sum, index, candidates,target, subList, res);
        subList.remove(subList.size()-1);
        
        sum -= candidates[index];        
        solve(sum, index+1, candidates,target, subList, res);
        
    
    }
}