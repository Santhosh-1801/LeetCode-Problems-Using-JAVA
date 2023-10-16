class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        Map<Integer,Integer> m1=new HashMap<>();
        for(int[] a:nums)
        {
            Arrays.sort(a);
            for(int i=0;i<a.length;i++)
            {
                if(m1.containsKey(a[i]))
                {
                    m1.put(a[i],m1.get(a[i])+1);
                }
                else 
                {
                    m1.put(a[i],1);
                }
            }
        }
        List<Integer> a1=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m3:m1.entrySet())
        {
            if(m3.getValue()==nums.length)
            {
                a1.add(m3.getKey());
            }
        }
        Collections.sort(a1);
        return a1;
        
    }
}