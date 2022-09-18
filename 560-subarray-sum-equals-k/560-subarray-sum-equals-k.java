class Solution {
    public int subarraySum(int[] nums, int k) {
        int len=nums.length,i,j,count=0,sum;
        for(i=0;i<len;i++)
        {
            sum=nums[i];
            if(sum==k)
            {
                count=count+1;
            }
            for(j=i+1;j<len;j++)
            {
                sum=sum+nums[j];
                if(sum==k)
                {
                    count=count+1;
                }
            }
        }
        return count;
        
    }
}