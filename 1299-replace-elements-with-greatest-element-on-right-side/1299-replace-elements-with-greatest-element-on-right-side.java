class Solution {
    public int[] replaceElements(int[] arr) {
        int maxi=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                maxi=Math.max(arr[j],maxi);
            }
            arr[i]=maxi;
            maxi=-1;
        }
        arr[arr.length-1]=-1;
        return arr;
        
    }
}