class Solution {
    public int[] plusOne(int[] digits) {
        int numberofdigits=digits.length;
        for(int i=numberofdigits-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else 
            {
                digits[i]=0;
            }
        }
        int x[]=new int[numberofdigits+1];
        x[0]=1;
        return x;
        
    }
}