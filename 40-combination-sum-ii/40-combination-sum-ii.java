class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        Arrays.sort(candidates);
        findingCombination(candidates,0,target,a,b);
        return a;   
    }
    public void findingCombination(int[] arr,int index, int target,
    List<List<Integer>> a,List<Integer> b)
    {
        if(target==0)
        {
            a.add(new ArrayList<>(b));
            return ;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(i>index && arr[i]==arr[i-1])
            {
                continue;
            }
            else if(arr[i]>target)
            {
                break;
            }
            b.add(arr[i]);
            findingCombination(arr,i+1,target-arr[i],a,b);
            b.remove(b.size()-1);
        }
            
        }
             
        
        
    }