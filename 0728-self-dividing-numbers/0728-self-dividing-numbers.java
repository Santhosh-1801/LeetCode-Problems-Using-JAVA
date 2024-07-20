class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(checkDividing(i))
            {
                result.add(i);
            }
        }
        return result;
        
    }
    public boolean checkDividing(int num)
    {
        int x=num;
        while(num>0)
        {
            int rem=num%10;
            if(rem==0 || x%rem!=0)
            {
                return false;
            }
            num=num/10;
        }
        return true;
    }
}