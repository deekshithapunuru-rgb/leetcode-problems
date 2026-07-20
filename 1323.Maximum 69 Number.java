class Solution {
    public int maximum69Number (int num) {
        int res = 0;
        List<Integer> s = new ArrayList<>();
        boolean changed = false;
        while (num != 0) {
            int digit = num % 10;
            num /= 10;
            s.add(digit);
        }
        for (int i = s.size()-1; i >= 0; i--) {
            int digit = s.get(i);
            if (!changed && digit == 6) {
                digit = 9;
                changed = true;
            }
            res += digit;
            res *= 10;
        }
        return res/10;
    }
}
