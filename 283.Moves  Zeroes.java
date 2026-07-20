class Solution {
    public void moveZeroes(int[] nums) {
        int a[] = new int[nums.length];

        for(int i = 0, j = 0; i < nums.length; i++) {
            if(nums[i] == 0) continue;
            a[j++] = nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}
