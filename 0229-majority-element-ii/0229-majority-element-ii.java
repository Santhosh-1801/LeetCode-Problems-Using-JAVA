class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> result=new HashMap<>();
        List<Integer> majorE=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(result.containsKey(nums[i]))
            {
                result.put(nums[i],result.get(nums[i])+1);
            }
            else
            {
                result.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entries:result.entrySet())
        {
            if(entries.getValue()>(nums.length)/3)
            {
                majorE.add(entries.getKey());
            }
        }
        return majorE;
        
    }
}