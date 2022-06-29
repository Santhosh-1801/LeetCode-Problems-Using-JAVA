class Solution {
    public String reversePrefix(String word, char ch) {
        int indexing=word.indexOf(ch)+1;
        char ch1[]=word.toCharArray();
        int n=ch1.length;
        for(int i=0;i<indexing/2;i++)
        {
            char temp=ch1[i];
            ch1[i]=ch1[indexing-i-1];
            ch1[indexing-i-1]=temp;
        }
        return String.valueOf(ch1);
        
    }
}