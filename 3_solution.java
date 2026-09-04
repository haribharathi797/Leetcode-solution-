import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        int maxLength = 0;
        int left = 0; // Left pointer of the window
        
        // Right pointer expands the window
        for (int right = 0; right < s.length(); right++) {
            // If character already exists, shrink the window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character and update max length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
