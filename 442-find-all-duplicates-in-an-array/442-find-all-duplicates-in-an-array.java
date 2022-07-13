class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int numbers=nums[i]-1;
            if(nums[i]==nums[numbers])
            {
                i=i+1;
            }
            else
            {
                swap(nums,i,numbers);
            }
        }
        
        List<Integer> l1=new LinkedList<>();
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                l1.add(nums[i]);
            }
        }
        return l1;
        
        
    }
    static void swap(int nums[],int i,int number)
    {
        int temp=nums[i];
        nums[i]=nums[number];
        nums[number]=temp;
    }
    
}