import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        
    char a[]=s.toCharArray();
        
        
    Stack<Character> s1=new Stack<>(); 
        
    
     for(char str1:a)
     {
         if(str1=='(' || str1=='[' || str1=='{')
         {
             s1.push(str1);
         }
        else if(str1==')')
        {
            if(s1.isEmpty() || s1.pop()!='(')
            {
                return false;
            }
        }
        else if(str1==']' ) 
        {
            if(s1.isEmpty() || s1.pop()!='[')
            {
                return false;
            }
        }
        else if(str1=='}' )
        {
            if(s1.isEmpty() || s1.pop()!='{')
            {
                return false;
            }
        }
     }
    return s1.isEmpty();
    
        
    }
}