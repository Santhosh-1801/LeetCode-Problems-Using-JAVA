class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length==1)
        {
            return nums[0];
        }
        
        Map<Integer,Integer> m1=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(m1.containsKey(nums[i]))
            {
                m1.put(nums[i],m1.get(nums[i])+1);
            }
            else
            {
                m1.put(nums[i],1);
            }
        }
        int p=0;
        
        for(Map.Entry<Integer,Integer> entry:m1.entrySet())
        {
            if(entry.getValue()==1)
            {
                p=entry.getKey();
            }
        }
        return p;
        
    }
}