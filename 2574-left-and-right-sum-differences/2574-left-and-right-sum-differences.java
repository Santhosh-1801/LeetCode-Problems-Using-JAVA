class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        int resultSum[]=new int[nums.length];
        
        int sum=0;
        for(int i=1;i<nums.length;i++)
        {
            sum=0;
            for(int j=0;j<i;j++)
            {
                sum=sum+nums[j];
            }
            leftSum[i]=sum;
        }
        sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum=0;
            for(int j=i+1;j<nums.length;j++)
            {
                sum=sum+nums[j];
            }
            rightSum[i]=sum;
        }
        for(int i=0;i<nums.length;i++)
        {
            resultSum[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return resultSum;
        
    }
}