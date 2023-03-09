class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        
        List<Integer> ans = new ArrayList<>();
        
        if(s.length() < p.length())
            return ans;
        int pLen = p.length();
        int sLen = s.length();
       int frequencyS[] = new int[26];
       int frequencyP[] = new int[26];

       for(int i = 0; i < pLen; i++)
       {
            frequencyP[p.charAt(i) - 'a']++;
       }
        
        for(int i = 0; i < pLen; i++)
       {
            frequencyS[s.charAt(i) - 'a']++;
       }
        if(check(frequencyS, frequencyP))
            ans.add(0);
         for(int i = pLen; i < sLen; i++)
       {
            frequencyS[s.charAt(i) - 'a']++;
            frequencyS[s.charAt(i - pLen) -'a']--;
             if(check(frequencyS, frequencyP))
            ans.add(i - pLen + 1);
             
             
       }
        
       return ans;
    }   
    private boolean check(int frequencyS[], int frequencyT[]){
          for(int i = 0; i<26; i++)
        {
            if(frequencyS[i] != frequencyT[i]) return false;
        }
       return true;
    }
}