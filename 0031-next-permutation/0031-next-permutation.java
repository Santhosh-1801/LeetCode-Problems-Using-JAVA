class Solution {
    public void nextPermutation(int[] nums) {
        
    int n=nums.length;
    int index=-1;
        
    for(int i=n-2;i>=0;i--)
    {
        if(nums[i]<nums[i+1])
        {
            index=i;
            break;
        }
    }
    if(index==-1)
    {
    for(int i=0;i<nums.length/2;i++)
    {
        int temp=nums[i];
        nums[i]=nums[nums.length-i-1];
        nums[nums.length-i-1]=temp;
    }
    }
        else{
    for(int i=n-1;i>index;i--)
    {
        if(nums[i]>nums[index])
        {
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
            break;
        }
    }
    for (int i = index + 1, j = n - 1; i < j; i++, j--) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
      
   }      
}
}