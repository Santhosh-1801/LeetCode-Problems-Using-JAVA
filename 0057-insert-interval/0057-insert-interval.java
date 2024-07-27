class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int curr=0;
        List<int[]> resultantArray=new ArrayList<>();
        while(curr<intervals.length && intervals[curr][1]<newInterval[0])
        {
            resultantArray.add(intervals[curr]);
            curr=curr+1;
        }
        while(curr<intervals.length && intervals[curr][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(intervals[curr][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[curr][1],newInterval[1]);
            curr=curr+1;
        }
        resultantArray.add(newInterval);
        while(curr<intervals.length)
        {
            resultantArray.add(intervals[curr]);
            curr=curr+1;
        }
        return resultantArray.toArray(new int[resultantArray.size()][]);

        
    }
}