import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            
            if (charIndexMap.containsKey(c)) {
                start = Math.max(start, charIndexMap.get(c) + 1);
            }
            
            charIndexMap.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}