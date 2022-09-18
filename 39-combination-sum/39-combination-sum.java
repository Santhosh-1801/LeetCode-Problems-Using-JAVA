class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        findingCombination(candidates,0,target,a,b);
        return a;
        
    }
    public void findingCombination(int[] arr,int index, int target,
    List<List<Integer>> a,List<Integer> b)
    {
        if(index==arr.length)
        {
        if(target==0)
        {
            a.add(new ArrayList<>(b));
        }
        return ;
        }
        else if(arr[index]<=target)
        {
            b.add(arr[index]);
            findingCombination(arr,index,target-arr[index],a,b);
            b.remove(b.size()-1);
            
        }
            findingCombination(arr,index+1,target,a,b);
        
        
    }
}