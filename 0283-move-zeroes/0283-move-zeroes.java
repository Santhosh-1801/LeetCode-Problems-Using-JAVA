class Solution {
    public void moveZeroes(int[] nums) {
        
        ArrayList<Integer> a1=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                a1.add(nums[i]);
            }
        }
        int nzeroes=a1.size();
        
        
        for(int i=0;i<nzeroes;i++)
        {
            nums[i]=a1.get(i);
        }
        
        for(int j=nzeroes;j<nums.length;j++)
        {
            nums[j]=0;
        }
        
    }
}