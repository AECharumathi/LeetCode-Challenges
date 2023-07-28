class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets= new HashSet<>();
        Arrays.sort(nums);
   
        for(int i=0; i< nums.length-2; i++){
           if(nums[i] > 0) 
                return new ArrayList<>(triplets);
           int j=i+1, k=nums.length-1;
           while(j < k ){
               int sum = addThree(nums[i],nums[j],nums[k]);
               List<Integer> arr = new ArrayList<>();
               if(sum == 0){
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    triplets.add(arr);
                    j++;
                    if(nums[j] == nums[j-1] && j < k) j++;
                }else if( sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return new ArrayList<>(triplets);
    }

    public int addThree(int x, int y, int z){
        return x+y+z;
    }
}