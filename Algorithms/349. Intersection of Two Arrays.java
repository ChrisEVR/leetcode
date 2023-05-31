import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int index = 0;
        int[] ans;

        for(short i = 0; i < nums1.length; ++i)
            set1.add(nums1[i]);
        
        for(short i = 0; i < nums2.length; ++i)
            set2.add(nums2[i]);

        ans = set1.size() < set2.size() ? new int[set1.size()] : new int[set2.size()];
        
        for(Integer s : set1)
            if(set2.contains(s)) ans[index++] = s;
        
        return Arrays.copyOf(ans, index);
    }
}