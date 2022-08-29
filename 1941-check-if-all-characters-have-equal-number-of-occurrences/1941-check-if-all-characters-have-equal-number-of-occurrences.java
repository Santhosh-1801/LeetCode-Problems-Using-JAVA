class Solution {
    public boolean areOccurrencesEqual(String s) {
         char[] ch=s.toCharArray();
	     HashMap<Character,Integer> h=new HashMap<>();
	     for(int i=0;i<ch.length;i++)
	     {
	         if(h.containsKey(ch[i]))
	         {
	             h.put(ch[i],h.get(ch[i])+1);
	         }
	         else 
	         {
	             h.put(ch[i],1);
	         }
	     }
	     return (new HashSet(h.values()).size()==1);
        
    }
}