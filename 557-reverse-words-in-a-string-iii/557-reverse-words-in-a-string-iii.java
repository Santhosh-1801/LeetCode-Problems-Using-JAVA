class Solution {
    public String reverseWords(String s) {
        String cha[]=s.split(" ");
        String rev="";
        for(int i=0;i<cha.length;i++)
        {
            rev=rev+(reversing(cha[i]))+" ";
        }
        return rev.trim();
        
        
    }
    public String reversing(String s1)
    {
        char a[]=s1.toCharArray();
        char j,temp;
        for(int i=0;i<a.length/2;i++)
        {
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        return String.valueOf(a);
            
    }
}