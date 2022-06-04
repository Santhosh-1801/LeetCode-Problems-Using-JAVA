class Solution {
    public String restoreString(String s, int[] indices) {
        char a[]=new char[indices.length];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<indices.length;j++)
            {
                if(indices[j]==i)
                {
                    a[i]=s.charAt(j);
                    break;
                }
            }
        }
        return String.valueOf(a);
        
    }
}