class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> a=new ArrayList<>();
        List<List<Integer>> b=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        permutess(a,b,freq,nums);
        return b;
        
    }
    public void permutess(List<Integer> b,List<List<Integer>> a,boolean freq[],int nums[])
    {
        if(b.size()==nums.length)
        {
            a.add(new ArrayList<>(b));
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
                
            {
                b.add(nums[i]);
                freq[i]=true;
                permutess(b,a,freq,nums);
                b.remove(b.size()-1);
                freq[i]=false;
            }
        }
    }
}