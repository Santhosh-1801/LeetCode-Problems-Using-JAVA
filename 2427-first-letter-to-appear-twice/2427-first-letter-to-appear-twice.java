class Solution {
    public char repeatedCharacter(String s) {
            int a[]=new int[26];
            char c='a';
            for(int i=0;i<s.length();i++)
            {
                a[s.charAt(i)-'a']++;
                if(a[s.charAt(i)-'a']==2){
                    c=s.charAt(i);
                    break;
                }
            }
            return c;
    }
}