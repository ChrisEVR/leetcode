class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1, current = nums[0];
        
        if(nums.length == 1) return 1;
        
        for(int i = 0; i < nums.length; ++i)
            if(current < nums[i]) nums[k++] = current = nums[i];
        
        return k;
    }
}