class Solution {
    public int sumOfUnique(int[] nums) 
    {
        boolean b=false;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]==nums[i])
                {
                    b=true;
                }
                
            }
            for(int k=i+1;k<nums.length;k++)
            {
                if(nums[k]==nums[i])
                {
                    b=true;
                }
            }
            if(b==false)
            {
                sum=sum+nums[i];
            }
            b=false;
        }
        return sum;
        
        
    }
}