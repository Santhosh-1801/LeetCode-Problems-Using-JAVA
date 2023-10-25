class Solution {
    public int dominantIndex(int[] nums) {
        
        int flag=0;
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]<2*nums[j])
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0)
            {
                return i;
            }
            flag=0;
        }
        return -1;
        
    }
}