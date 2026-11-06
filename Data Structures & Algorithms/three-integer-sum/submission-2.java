class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // output to return
        List<List<Integer>> output = new ArrayList<>();

        // sort the array before using pointers O(n log n)
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1, right = nums.length - 1;

            while (left < right) {

                int sumOf3 = nums[i] + nums[left] + nums[right];

                // i + left + right == 0
                if (sumOf3 == 0) {
                    output.add(List.of(nums[i], nums[left], nums[right]));
                    left++;

                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }

                if (sumOf3 > 0) {
                    right--;
                }

                if (sumOf3 < 0) {
                    left++;
                }
            }
        }

        return output;



        
        
    }
}
