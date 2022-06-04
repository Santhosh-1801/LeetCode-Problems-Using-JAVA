class Solution {
    public String truncateSentence(String s, int k) {
        String[] arStr=s.split(" ");
        String truncSev="";
        for(int i=0;i<k;i++)
        {
            truncSev=truncSev+arStr[i]+" ";
        }
        return truncSev.trim();
        
    }
}