class Solution {
    public boolean judgeCircle(String moves) {
        int [] freq = new int[4];
        int n =moves.length();
        for(int i =0;i<n;i++){
            if(moves.charAt(i)=='U') freq[0]++;
            else if(moves.charAt(i)=='D') freq[1]++;
            else if(moves.charAt(i)=='L') freq[2]++;
            else freq[3]++;
        }
        if(freq[0]==freq[1] && freq[2]==freq[3]) return true;
        else return false;
    }
}
