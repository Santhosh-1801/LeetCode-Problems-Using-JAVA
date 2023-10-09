class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        List<Integer> l=new ArrayList<>(hs);
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            nums[i]=l.get(i);
        }
        return hs.size();
        
    }
}