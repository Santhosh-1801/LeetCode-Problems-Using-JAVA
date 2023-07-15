class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        int a[]=new int[2];
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i+j==n && checkZero(i) && checkZero(j) )
                {
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        
        return a;
        
    }
    public boolean checkZero(int number)
    {
        while(number>0)
        {
            int rem=number%10;
            if(rem==0)
            {
                return false;
            }
            number=number/10;
        }
        
        return true;
    }
}