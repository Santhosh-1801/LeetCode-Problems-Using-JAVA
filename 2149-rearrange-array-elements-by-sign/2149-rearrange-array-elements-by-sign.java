class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int no:nums)
        {
            if(no>0)
            {
                pos.add(no);
            }
            else{
                neg.add(no);
            }
        }
        for(int i=0;i<nums.length/2;i++)
        {
            nums[2*i]=pos.get(i);
            nums[2*i+1]=neg.get(i);
        }
        return nums;
        
       
    }
}