class Solution {
    public int findLucky(int[] arr) {

        Map<Integer,Integer> arrayValues=new HashMap<>();
        int max=-1;

        for(int i=0;i<arr.length;i++)
        {
            if(arrayValues.containsKey(arr[i]))
            {
                arrayValues.put(arr[i],arrayValues.get(arr[i])+1);
            }
            else{
                arrayValues.put(arr[i],1);
            }
        }
    
        for(Map.Entry<Integer,Integer> val:arrayValues.entrySet()){
            if(val.getKey()==val.getValue()){
                if(val.getKey()>max){
                    max=val.getKey();
                }
            }
        }
        return max;
        
    }
}