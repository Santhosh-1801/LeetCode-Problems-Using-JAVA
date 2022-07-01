class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.trim();
        String splitting[]=s1.split(" ");
        return splitting[splitting.length-1].length();
        
        
    }
}