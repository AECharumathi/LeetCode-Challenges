/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function(letters, target) {
    var first = 0, last = letters.length, mid;
    while(first < last){
        mid = Math.floor(first + (last - first) / 2);
        if(mid-1 >= 0 ){
            if(letters[mid] > target && letters[mid-1] <= target)
                return letters[mid];
            else if(letters[mid] <= target)
                first = mid+1;
            else if(letters[mid] > target && letters[mid-1] > target)
                last = mid;
        }else if(letters[mid] > target){
            return letters[mid];
        }  
    }
    return letters[0];
};