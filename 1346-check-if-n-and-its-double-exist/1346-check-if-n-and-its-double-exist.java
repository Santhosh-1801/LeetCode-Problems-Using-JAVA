class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(s1.contains(arr[i]*2) || (arr[i]%2==0) && s1.contains(arr[i]/2) )
            {
                return true;
            }
            s1.add(arr[i]);
        }
        return false;
    }
}