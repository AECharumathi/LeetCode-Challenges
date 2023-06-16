/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let index = 0, count = 1;
    while(index < nums.length-1){
        if(nums[index] === nums[index+1]){
            if(count === 2){
                nums.splice(index,1);
            }else{
                count++;
                index++;
            }
        }else{
            count = 1;
            index++;
        } 
    }
};
