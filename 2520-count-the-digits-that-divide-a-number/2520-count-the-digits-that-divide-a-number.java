class Solution {
    public int countDigits(int num) {
        
        Map<Integer,Integer>m1=new HashMap<>();
        
        int orgNum=num;
        int totalCount=0;
        
        while(num!=0)
        {
            int rem=num%10;
            if(orgNum%rem==0)
            {
                if(m1.containsKey(rem))
                {
                    m1.put(rem,m1.get(rem)+1);
                }
                else 
                {
                    m1.put(rem,1);
                }
            }
            num=num/10;
            
        }
        for (int count : m1.values()) {
            totalCount += count;
        }
        return totalCount;
        
    }
}