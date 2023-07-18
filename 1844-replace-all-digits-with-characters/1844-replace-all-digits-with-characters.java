class Solution {
    public String replaceDigits(String s) {
        
        char a[]=s.toCharArray();
        for(int i=1;i<s.length();i+=2)
        {
            a[i]=(char)(a[i-1]+(a[i]-'0'));
            System.out.print(a[i]);
        }
        return String.valueOf(a);
        
    }
}