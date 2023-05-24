import java.util.LinkedList;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        LinkedList<Integer> list = new LinkedList<>();
        short indList1 = 0, indList2 = 0;
        
        while(indList1 < m && indList2 < n){
            
            if(nums1[indList1] <= nums2[indList2]){
                list.add(nums1[indList1]);
                indList1++;
            }else{
                list.add(nums2[indList2]);
                indList2++;
            }
            
        }
        
        if(indList1 < m) for(; indList1 < m; indList1++) list.add(nums1[indList1]);
        
        if(indList2 < n) for(; indList2 < n; indList2++) list.add(nums2[indList2]);
        
        for(int i = 0; i < list.size(); ++i) nums1[i] = list.get(i);
    }
}