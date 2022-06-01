import java.lang.Math;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=new String();
        Arrays.sort(strs);
        int len=strs.length;
        if(len==0)
        {
            return " ";
        }
        else if(len==1)
        {
            return strs[0];
        }
        else
        {
            int end=Math.min(strs[0].length(),strs[strs.length-1].length());
            int i=0;
            while(i<end && strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            {
                i=i+1;
            }
            s=strs[0].substring(0,i);
            return s;
            }
        
    }
}