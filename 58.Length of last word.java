class Solution {
    public int lengthOfLastWord(String s) {

        String str = s.trim();
        String[] words = str.split(" ");

        return words[words.length - 1].length();
    }
}
