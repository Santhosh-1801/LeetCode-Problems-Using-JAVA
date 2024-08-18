class Solution {
    public String reverseVowels(String s) {
        char[] reverseString = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int first = 0;
        int last = reverseString.length - 1;

        while (first < last) {
            // Move 'first' forward if it's not pointing to a vowel
            if (vowels.indexOf(reverseString[first]) == -1) {
                first++;
                continue;
            }
            // Move 'last' backward if it's not pointing to a vowel
            if (vowels.indexOf(reverseString[last]) == -1) {
                last--;
                continue;
            }
            // Swap the vowels
            char temp = reverseString[first];
            reverseString[first] = reverseString[last];
            reverseString[last] = temp;
            
            // Move both pointers inward
            first++;
            last--;
        }
        return String.valueOf(reverseString);
    }
}
