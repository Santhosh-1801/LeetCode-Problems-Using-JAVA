class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[nums.length];
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            a[2*i]=nums[i];
            a[(2*i)+1]=nums[n+i];
        }
        return a;
    }
}