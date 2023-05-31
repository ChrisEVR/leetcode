class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new LinkedList<>();
        Map<Integer, Integer> map1 =  new HashMap<>();
        Map<Integer, Integer> map2 =  new HashMap<>();

        for(int i = 0; i < Math.max(nums1.length, nums2.length); ++i){
            if(i < nums1.length) map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
            if(i < nums2.length) map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }

        for(int i = 0; i < nums1.length; ++i)
            if(map1.containsKey(nums1[i]) && map2.containsKey(nums1[i]))
                while(map1.get(nums1[i]) > 0 && map2.get(nums1[i]) > 0){
                    list.add(nums1[i]);
                    map1.put(nums1[i], map1.get(nums1[i]) - 1);
                    map2.put(nums1[i], map2.get(nums1[i]) - 1);
                }
        

        return list.stream().mapToInt(i -> i).toArray();
    }
}