class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length-1);
        return nums;
    }
    
    public void sort(int[] nums, int l, int r){
     if(l < r ){
        int m = l + (r - l) / 2 ;
        sort(nums, l , m);
        sort(nums, m+1, r);
        mergeSort(nums, l , m ,r); 
      }
    }
    
    public void mergeSort(int[] nums, int l, int m, int r){
        int lin = m - l + 1, rin = r - m;
        
        int[] larr = new int[lin];
        int[] rarr = new int[rin];
        for(int i = 0; i< lin ; i++){
            larr[i] = nums[l + i];
        }
        for(int i = 0; i< rin ; i++){
            rarr[i] = nums[m + 1 + i];
        }
        
        int i = 0, j = 0, k = l;
        
        while(lin > i && rin > j ){
             if(larr[i] > rarr[j] ){
                 nums[k] = rarr[j];
                 j++;
             }else{
                 nums[k] = larr[i];
                 i++;
             }
            k++;
        }
        
        while(lin > i ){
            nums[k] = larr[i];
            i++;
            k++;
        }
        
        while(rin > j){
            nums[k] = rarr[j];
            j++;
            k++;
        }
    }
}