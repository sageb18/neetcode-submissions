class Solution {
    public int maxArea(int[] heights) {

        int left = 0, right = heights.length - 1;

        int maxArea = 0;

        while (left < heights.length && right >= 0) {
            
            int minHeight = Math.min(heights[left], heights[right]); // (1, 6) = 1
            int width = right - left;

            maxArea = Math.max(maxArea, minHeight * width);

            if (heights[left] < heights[right]) {
                left++;
            }

            else if (heights[right] < heights[left]) {
                right--;
            }

            else {
                right--;
            }

        }

        return maxArea; 
        
    }
}
