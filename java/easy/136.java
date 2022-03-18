// Solution to LC easy #136

class Solution {
    public int singleNumber(int[] nums) {
        
      for(int i = 0; i < nums.length; i++) {
          int current = nums[i];
          int count = 0;
          for(int j = 0; j < nums.length; j++) {
              if(current == nums[j]) count++;
          }
          if(count == 1) return current;
      }
    return -1;
    }
}
