class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size=grid[0].length*grid[0].length;
        int totalSum=(size*(size+1))/2;
        int sum=0;
        int result[]=new int[2];
        Set<Integer> values=new HashSet<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(values.contains(grid[i][j]))
                {
                    result[0]=grid[i][j];
                }
                else
                {
                    values.add(grid[i][j]);
                    sum=sum+grid[i][j];
                }
            }
        }
        result[1]=totalSum-sum;
        return result;
    }
}