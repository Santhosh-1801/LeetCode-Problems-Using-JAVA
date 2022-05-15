class Solution {
    public String reverseWords(String s) {
        String newwords[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=newwords.length-1;i>=0;i--)
        {
            if(!newwords[i].isEmpty())
            {
                sb.append(newwords[i]+" ");
            }
            
        }
        return sb.toString().trim();
        
        
    }
}