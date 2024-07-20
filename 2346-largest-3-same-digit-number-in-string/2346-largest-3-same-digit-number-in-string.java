class Solution {
    public String largestGoodInteger(String num) {
        String max=null;
        for(int i=0;i<=num.length()-3;i++)
        {
            String numSubString=num.substring(i,i+3);
            if(numSubString.equals("000")||numSubString.equals("111") || 
            numSubString.equals("222") || 
            numSubString.equals  ("333") || numSubString.equals("444") || 
            numSubString.equals("555") || numSubString.equals("666") || 
            numSubString.equals("777") || numSubString.equals("888") || 
            numSubString.equals("999"))
            {
                if(max==null ||Integer.parseInt(max)<Integer.parseInt(numSubString))
                {
                    max=numSubString;
                }
            }
        }
        return max!=null?max:"";
    }
}