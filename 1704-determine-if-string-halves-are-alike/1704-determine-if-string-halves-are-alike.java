class Solution {
    public boolean halvesAreAlike(String s) {
        
        int n=s.length();
        String s1=s.substring(0,n/2);
        String s2=s.substring(n/2);
        
        int count=0;
        
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' ||               s1.charAt(i)=='u' || s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || 
              s1.charAt(i)=='O' || s1.charAt(i)=='U')
            {
                count = count + 1;
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='a' || s2.charAt(i)=='e' || s2.charAt(i)=='i' || s2.charAt(i)=='o' ||               s2.charAt(i)=='u' || s2.charAt(i)=='A' || s2.charAt(i)=='E' || s2.charAt(i)=='I' || 
              s2.charAt(i)=='O' || s2.charAt(i)=='U')
            {
                count = count - 1;
            }
        }
        return count==0;
        
        
    }
}