class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;
        String map[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        genrateCombination(0, "", digits, res,map);
        return res;
    }
    private void genrateCombination(int index, String combination, String digits,
                                   List<String> res,  String map[]){
        if(index == digits.length())
        {
            res.add(combination);
            return;
        }
        int dgt = digits.charAt(index) - '2';
        String toMap = map[dgt];
        for(int  i = 0; i < toMap.length(); i++){
             genrateCombination(index+1, combination+toMap.charAt(i), digits, res,map);
        }
        
    }
}
