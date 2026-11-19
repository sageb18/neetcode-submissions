class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(s.charAt(right));

            maxLength = Math.max(maxLength, seen.size());
            right++;
    
        }

        return maxLength;
    }
}
