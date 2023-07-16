class Solution {
    public int trap(int[] height) {
        
        int[] leftH=new int[height.length];
        int[] rightH=new int[height.length];
        int maxH=-1,total=0;
        
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>maxH)
            {
                maxH=height[i];
            }
            leftH[i]=maxH;
        }
        maxH=-1;
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>maxH)
            {
                maxH=height[i];
            }
            rightH[i]=maxH;
        }
        for(int i=0;i<height.length;i++)
        {
            total+=Math.min(leftH[i],rightH[i])-height[i];
        }
        return total;
        
    }
}