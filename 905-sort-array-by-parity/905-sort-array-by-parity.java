class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                even.add(nums[i]);
            }
            else 
            {
                odd.add(nums[i]);
            }
        }
        int i=0,count=0;
        while(i<even.size())
        {
            nums[count++]=even.get(i);
            i=i+1;
        }
        i=0;
        while(i<odd.size())
        {
            nums[count++]=odd.get(i);
            i=i+1;
        }
        return nums;
    }
}