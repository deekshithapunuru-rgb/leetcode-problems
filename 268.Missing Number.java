class Solution {
    public int missingNumber(int[] nums) 
    {
        int XOR = 0;

        for(int num : nums){

            XOR = XOR ^ num;
        }

        int n = nums.length;
        for(int i = 0; i <= n; i++)
        {
            XOR = XOR ^ i;
        }
        return XOR;
    }
}
