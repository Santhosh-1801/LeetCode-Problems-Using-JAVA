class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<Integer> a=new ArrayList<>();
        List<List<Integer>> b=new ArrayList<>();
        Arrays.sort(nums);
        subs(0,0,a,b,nums);
        return b;
        
        
    }
    public void subs(int sum,int index,List<Integer> a,List<List<Integer>> b,int arr[])
    {
        b.add(new ArrayList<>(a));
        for(int i=index;i<arr.length;i++)
        {
            if(i!=index && arr[i]==arr[i-1])
            {
                continue;
            }
            a.add(arr[i]);
            subs(sum+arr[i],i+1,a,b,arr);
            a.remove(a.size()-1);
            
                
        }
    }
}