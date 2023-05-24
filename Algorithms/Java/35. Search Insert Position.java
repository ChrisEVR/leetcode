class Solution {
    public int searchInsert(int[] nums, int target) {
        short left = 0, right = (short)(nums.length - 1), mid = 0;

        while(left <= right){
            mid = (short)((left + right) / 2);
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = (short)(mid + 1);
            else right = (short)(mid - 1);
        }

        return left;
    }
}