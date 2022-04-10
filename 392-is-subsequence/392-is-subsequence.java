class Solution {
    public boolean isSubsequence(String s, String t)
    {
        for(char ch:s.toCharArray())
        {
            int index=t.indexOf(ch);
            if(index==-1)
            {
                return false;
            }
            t=t.substring(index+1);
        }
        return true;
        
    }
}