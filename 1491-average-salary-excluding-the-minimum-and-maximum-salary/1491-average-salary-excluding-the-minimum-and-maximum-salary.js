/**
 * @param {number[]} salary
 * @return {number}
 */
var average = function(salary) {
    salary.sort((a,b)=>a-b);
    var total =0 ;
    for(var i=1; i<salary.length-1; i++){
        total +=salary[i];
    }
    var avg = total/(salary.length-2);
    return  avg; 
};