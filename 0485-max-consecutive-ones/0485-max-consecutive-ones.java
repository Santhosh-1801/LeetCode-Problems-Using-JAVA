import java.lang.Math;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        
        int count=0,cons=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count=count+1;
            }
            else
            {
                count=0;
            }
            cons=Math.max(count,cons);
        }
        return cons;
        
    }
}