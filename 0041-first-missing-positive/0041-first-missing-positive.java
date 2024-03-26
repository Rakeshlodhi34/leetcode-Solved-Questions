class Solution {
    public int firstMissingPositive(int[] nums) {
        int missingInteger = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;
                if (nums[i] <= missingInteger) {
                    missingInteger++;
                    continue;
                }
                return missingInteger;
            }
        }
        return missingInteger;  
    }
}