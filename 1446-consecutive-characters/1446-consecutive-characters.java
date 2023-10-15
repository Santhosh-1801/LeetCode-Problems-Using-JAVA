class Solution {
    public int maxPower(String s) {
        
        int count=0,cons=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length-1;i++)
        {
            
            if(arr[i]==arr[i+1])
            {
                count=count+1;
            }
            else 
            {
                count=0;
            }
           
            cons=Math.max(count,cons);
        }
        return cons+1;
        
    }
}