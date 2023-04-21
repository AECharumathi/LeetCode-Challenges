/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let filteredArray = [];
    arr.forEach((a,index)=> {
        if(fn(a,index)) filteredArray.push(a);
    });
  
    return filteredArray;
};