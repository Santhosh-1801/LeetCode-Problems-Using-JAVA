class Solution {
    public String capitalizeTitle(String title) {
        String cappy="";
        String cap=new String();
        String ch[]=title.split(" ");
        for(int i=0;i<ch.length;i++)
        {
            String revs=ch[i].toLowerCase();
            if(revs.length()>2)
            {
             cap=revs.substring(0,1).toUpperCase()+revs.substring(1);
            }
            else
            {
             cap=revs.substring(0,1).toLowerCase()+revs.substring(1);
            }
            cappy=cappy+cap+" ";
        }
        return cappy.trim();
        
    }
}