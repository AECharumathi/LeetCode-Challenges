class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> triplets= new HashSet<>();
        
        Arrays.sort(nums);
   
        for(int i=0; i< nums.length-2; i++){
           
           if(nums[i] > 0) 
                return new ArrayList<>(triplets);
            
           int j=i+1, k=nums.length-1;
           
           while(j < k ){
              int sum = nums[i] + nums[j] + nums[k];
            
              if(sum == 0){
                 triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                 j++;
                
                 if(nums[j] == nums[j-1] && j < k)
                   j++;
               
              }else if( sum < 0){
                  j++;
              }else{
                  k--;
              }
           }
        }
        
        return new ArrayList<>(triplets);
    }

}