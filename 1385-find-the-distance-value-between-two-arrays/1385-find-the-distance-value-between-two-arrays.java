class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int count=0;
        int result;
        boolean s1=false;
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                result=Math.abs(arr1[i]-arr2[j]);
                if(result<=d)
                {
                    count=count+1;
                    break;
                }
                
            }
        }
        return arr1.length-count;
        
    }
}