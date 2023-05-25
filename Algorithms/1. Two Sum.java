import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int firstIndex = 0;
        
        for(int secondIndex = 1; secondIndex < nums.length; ++secondIndex){
            if(nums[firstIndex] + nums[secondIndex] == target){
                res[0] = firstIndex;
                res[1] = secondIndex;
                break;
            }
            
            if(secondIndex == (nums.length - 1)){
                firstIndex++;
                secondIndex = firstIndex;
            }
        }
        
        return res;
    }
}