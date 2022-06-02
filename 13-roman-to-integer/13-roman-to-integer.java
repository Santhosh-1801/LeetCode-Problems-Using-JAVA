class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
        h1.put('I',1);
        h1.put('V',5);
        h1.put('X',10);
        h1.put('L',50);
        h1.put('C',100);
        h1.put('D',500);
        h1.put('M',1000);
        int result=0,i;
        for(i=0;i<s.length()-1;i++)
        {
            if(h1.get(s.charAt(i))>=h1.get(s.charAt(i+1)))
            {
                result=result+h1.get(s.charAt(i));
            }
            else
                
            {
                result=result-h1.get(s.charAt(i));
            }
        }
        result=result+h1.get(s.charAt(i));
        
        return result;
    }
}