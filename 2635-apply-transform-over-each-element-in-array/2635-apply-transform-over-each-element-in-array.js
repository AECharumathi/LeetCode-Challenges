/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var returnedArray = [];
    arr.forEach((a,index)=> returnedArray.push(fn(a,index)));
    return returnedArray;
};