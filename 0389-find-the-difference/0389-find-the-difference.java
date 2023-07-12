class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        
        int sum1=0,sum2=0;
        for(int i=0;i<str1.length;i++)
        {
            sum1=sum1+(int)str1[i];
        }
        for(int j=0;j<str2.length;j++)
        {
            sum2=sum2+(int)str2[j];
        }
        int result=sum2-sum1;
        return (char)result;
        
        
    }
}