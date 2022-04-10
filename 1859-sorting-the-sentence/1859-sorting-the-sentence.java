class Solution {
    public String sortSentence(String s) {
        int index;
        String arr1[]=s.split(" ");
        String res="";
        String temp[]=new String[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            index=arr1[i].charAt(arr1[i].length()-1)-'0';
            temp[index-1]=arr1[i].substring(0,arr1[i].length()-1);
                            
        }
        for(int i=0;i<temp.length;i++)
        {
            res+=temp[i];
            res+=" ";
        }
        return res.trim();
    }
}