//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        
        for (int end = 0; end < S.length(); end++) {
            char c = S.charAt(end);
            
            if (charIndexMap.containsKey(c)) {
                start = Math.max(start, charIndexMap.get(c) + 1);
            }
            
            charIndexMap.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
}
}