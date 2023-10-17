class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> a1=new ArrayList<>();
        Set<Integer> l1=new HashSet<>();
        Set<Integer> l2=new HashSet<>();
        Set<Integer> l3=new HashSet<>();
        for(int i:nums1)
        {
            l1.add(i);
        }
        for(int i:nums2)
        {
            l2.add(i);
        }
        for(int i:nums2)
        {
            if(!l1.contains(i))
            {
                l3.add(i);
            }
        }
        l1.removeAll(l2);
        a1.add(new ArrayList<>(l1));
        a1.add(new ArrayList<>(l3));
        return a1;
        
        
    }
}