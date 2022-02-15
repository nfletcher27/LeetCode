// Solution to LC easy #1929

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
            nums2[nums.length+i] = nums[i];
        }
        return nums2;
    }
}
