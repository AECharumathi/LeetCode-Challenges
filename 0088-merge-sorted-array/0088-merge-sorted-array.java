class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j=n-1, limit = m+n-1;
        
        while(i >= 0 && j >= 0 ){
            if(nums1[i] > nums2[j]){
                nums1[limit] = nums1[i];
                i--;
            }else{
                nums1[limit] = nums2[j];
                j--;
            }
            limit--;
        }
        
        while(j >= 0){
            nums1[limit] = nums2[j];
            j--;
            limit--;
        }
        
        while(i >= 0){
            nums1[limit] = nums1[i];
            i--;
            limit--;
        }
        
        
        return ;
    }
}