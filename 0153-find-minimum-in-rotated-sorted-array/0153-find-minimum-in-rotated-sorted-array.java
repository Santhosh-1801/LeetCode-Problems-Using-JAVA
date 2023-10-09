class Solution {
    public int findMin(int[] nums) {
        
        int n = nums.length; 
        int ans = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < ans) {
                ans = nums[i];
                index = i;
            }
        }
        return nums[index];
        
    }
}