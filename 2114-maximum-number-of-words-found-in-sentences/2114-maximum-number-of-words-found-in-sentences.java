class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxwords=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++)
        {
            String s[]=sentences[i].split(" ");
            int a=s.length;
            if(a>maxwords)
            {
                maxwords=a;
            }
        }
        return maxwords;
    }
}