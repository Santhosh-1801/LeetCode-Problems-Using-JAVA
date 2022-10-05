class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        char a[]=word1.toCharArray();
        char b[]=word2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int c[]=new int[26];
        int d[]=new int[26];
        for(int i=0;i<word1.length();i++)
        {
            c[a[i]-'a']+=1;
            d[b[i]-'a']+=1;
        }
        for(int i=0;i<26;i++)
        {
            if(Math.abs(c[i]-d[i])>3)
            {
                return false;
            }
        }
        return true;
    }
}