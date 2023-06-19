class Solution {
    public int minAddToMakeValid(String s) {
        
        
    char a[]=s.toCharArray();
        
    int counter=0;
        
        
    Stack<Character> s1=new Stack<>(); 
        
    
     for(char str1:a)
     {
         if(str1=='(' || str1=='[' || str1=='{')
         {
             s1.push(str1);
         }
        else if(str1==')')
        {
            if(s1.isEmpty() || s1.peek()!='(')
            {
                counter=counter+1;
            }
            else 
            {
                s1.pop();
            }
        }
     }
    return counter+s1.size();
    
    }
}