class Solution {
    public int countVowelSubstrings(String word) {
     int c = 0;
     for (int i = 0;i < word.length(); i++) {
         String s = "";
         for (int j = i;j<word.length();j++)  {
            char ch = word.charAt(j);
            if ("aeiou".indexOf(ch)==-1)break;
            s+=ch;
            if (s.contains("a")&& s.contains("e")&& s.contains("i")
                &&s.contains("o")&& s.contains("u") )
               c++; 
         }
     }
     return c;
    }
}
