class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> results=new ArrayList<>();
        int index=0;
        for(int i=0;i<intervals.length;i++)
        {
            int currentStart=intervals[i][0];
            int currentEnd=intervals[i][1];
            while(i<intervals.length-1 && currentEnd>=intervals[i+1][0])
            {
                currentEnd=Math.max(currentEnd,intervals[i+1][1]);
                i++;
            }
            results.add(new int[]{currentStart,currentEnd});
        }
        int mergedResults[][]=new int[results.size()][2];
        for(int[] individual:results)
        {
            mergedResults[index]=individual;
            index=index+1;
        }
        return mergedResults;

        
    }
}