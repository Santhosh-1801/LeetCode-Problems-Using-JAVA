class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(checkIfPalindrome(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }
    public boolean checkIfPalindrome(String word)
    {
        int i=0;
        int j=word.length()-1;
        while(i<j)
        {
            if(word.charAt(i)!=word.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}