class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]==nums2[j])
            {
                arr.add(nums1[i]);
                i++;
                j++;
                break;
            }
            else
            {
                j++;
            }
        }
        if(arr.size()==0)
        {
            return -1;
        }
        return arr.get(0);
        
    }
}