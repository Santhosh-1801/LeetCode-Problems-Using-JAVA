class Solution {
    public boolean rotateString(String s, String goal) {
        
        int count;
		
        
        char str1[]=s.toCharArray();
        char str2[]=goal.toCharArray();
        int i=0;
        
        count=s.indexOf(goal.charAt(0));
        while(i<=str1.length-1)
        {
            char temp=str1[0];
            for(int j=1;j<=str1.length-1;j++)
            {
                str1[j-1]=str1[j];
            }
            str1[str1.length-1]=temp;
            i++;
            if(String.valueOf(str1).equals(String.valueOf(str2))==true)
            {
                return true;
            }
            
        }
        return false;
        
    }
}