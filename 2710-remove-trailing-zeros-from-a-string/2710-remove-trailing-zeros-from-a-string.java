class Solution {
    public String removeTrailingZeros(String num) {
        
        
        int j=num.length()-1;
        while(j>=0 && num.charAt(j)=='0')
        {
            j=j-1;
        }
        num=num.substring(0,j+1);
        return num;
        
    }
}