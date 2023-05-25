class Solution {
    public int removeElement(int[] nums, int val) {

        short ans = (short)nums.length;

        for(short i = 0; i < ans; ++i)
            if(nums[i] == val)
                nums[i--] = nums[ans-- - 1];
        
        return ans;
    }
}