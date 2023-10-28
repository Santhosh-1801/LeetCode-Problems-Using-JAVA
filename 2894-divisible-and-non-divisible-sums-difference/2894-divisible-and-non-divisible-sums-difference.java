class Solution {
    public int differenceOfSums(int n, int m) {
        
        int ndivs=0,divs=0;
        
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                divs=divs+i;
            }
            else
            {
                ndivs=ndivs+i;
            }
        }
        return ndivs-divs;
        
    }
}