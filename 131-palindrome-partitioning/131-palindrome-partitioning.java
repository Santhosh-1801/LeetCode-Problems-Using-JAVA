class Solution {
    public List<List<String>> partition(String s) 
    {
	   List<List<String>> a=new ArrayList<>();
	   List<String> b=new ArrayList<>();
	   palinpartitioning(0,s,a,b);
	   return a;
    }
    static void palinpartitioning(int index,String s1,List<List<String>> a,List<String> b)
	{
	    if(index==s1.length())
	    {
	        a.add(new ArrayList<>(b));
	        return ;
	    }
	    for(int i=index;i<s1.length();i++)
	    {
	        if(isPalindrome(s1,index,i))
	        {
	            b.add(s1.substring(index,i+1));
	            palinpartitioning(i+1,s1,a,b);
	            b.remove(b.size()-1);
	            
	        }
	    }

	}
	static boolean isPalindrome(String s1,int index,int i)
	{
	    while(index<=i)
	    {
	        if(s1.charAt(index++)!=s1.charAt(i--))
	        {
	            return false;
	        }
	    }
	    return true;
	}
}