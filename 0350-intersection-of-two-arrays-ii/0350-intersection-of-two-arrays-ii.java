class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr=new ArrayList<>();
        
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]==nums2[j])
            {
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else
            {
                j++;
            }
            
        }
        int s=arr.size();
        int res[]=new int[s];
        for(int z=0;z<s;z++)
        {
            res[z]=arr.get(z);
        }
        return res;
        
    }
}