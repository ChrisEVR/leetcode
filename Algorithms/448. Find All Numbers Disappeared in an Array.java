class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int index;
        List<Integer> ans = new LinkedList<>();

        for(int num : nums){
            index = Math.abs(num) - 1;
            if(nums[index] > 0) nums[index] = nums[index] * -1;
        }

        for(int i = 0; i < nums.length; i++) if(nums[i] > 0) ans.add(i + 1);

        return ans;
    }
}