class Solution {
    public int firstUniqChar(String s) {
       
        int[] freq = new int[26];
        char[] total= s.toCharArray();
        int value=0;

        for(char a:total)
        {
            freq[a-'a']++;
        }
    

        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)
             {
                 return i;
            }
    }   
     System.gc();
    return -1;
    
 }
}
