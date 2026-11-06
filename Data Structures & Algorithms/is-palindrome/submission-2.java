class Solution {
    public boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;

        char[] arr = s.toCharArray();

        while (left < s.length() && right >= 0) {

            if (!Character.isLetterOrDigit(arr[right])) {
                right--;
                continue;
            }

            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
                continue;
            }

            if (!(Character.toLowerCase(arr[left]) == Character.toLowerCase(arr[right]))) {
                return false;
            }

            left++;
            right--;

        }

        return true;
        
    }
}
