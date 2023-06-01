class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;

        for(int i = 0; i < nums.length; ++i)
            if(first == null || nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }else if(second == null || (nums[i] > second && !first.equals(nums[i]))){
                third = second;
                second = nums[i];
            }else if(third == null || (nums[i] > third && !second.equals(nums[i]))) third = nums[i];

        return third != null ? third : Math.max(second, first);
    }
}