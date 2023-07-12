class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum1=sum1+nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
            sum2=sum2+sumofDigits(nums[i]);
            }
            else 
            {
            sum2=sum2+nums[i];
            }
        }
        return Math.abs(sum1-sum2);
        
    }
    public int sumofDigits(int num){
        int res=0;
        while(num>0)
        {
            int rem=num%10;
            res=res+rem;
            num=num/10;
            
        }
        return res;
        
    }
}