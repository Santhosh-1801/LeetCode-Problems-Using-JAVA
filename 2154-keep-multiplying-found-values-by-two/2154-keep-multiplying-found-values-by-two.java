class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==original)
            {
                original=original*2;
                findFinalValue(nums,original);
            }
        }
        return original;
        
        
        
    }
    
}