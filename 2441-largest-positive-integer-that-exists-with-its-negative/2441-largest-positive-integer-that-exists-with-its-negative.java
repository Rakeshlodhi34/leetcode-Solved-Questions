class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = -1;
        for (Integer n : set) {
            if (set.contains(-n) && Math.abs(n) > max) {
                max = Math.abs(n);
            }
        }
        return max;
    }
}