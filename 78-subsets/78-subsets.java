class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        subsets(nums,a,b,0);
        return a;
        
    }
    public void subsets(int nums[],List<List<Integer>> a,List<Integer> b,int index)
    {
        if(index==nums.length)
        {
            a.add(new ArrayList<>(b));
            return ;
        }
        b.add(nums[index]);
        subsets(nums,a,b,index+1);
        b.remove(b.size()-1);
        subsets(nums,a,b,index+1);
    }
}