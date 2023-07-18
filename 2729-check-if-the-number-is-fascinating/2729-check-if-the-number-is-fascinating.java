class Solution {
    public boolean isFascinating(int n) {
        
        String s1=String.valueOf(n);
        s1=s1.concat(String.valueOf(n*2)).concat(String.valueOf(n*3));
        char a[]=s1.toCharArray();
        Map<Character,Integer> m1=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
           if((a[i]!='0'))
           {
                if(m1.containsKey(a[i]))
            {
                return false;
            }
               else
               {
                   m1.put(a[i],1);
               }
           }
           else 
              {
                  return false;
              }
        }
        return m1.size()==9;
        
    }
}