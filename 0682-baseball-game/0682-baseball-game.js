/**
 * @param {string[]} operations
 * @return {number}
 */
var calPoints = function(operations) {
    var score = [];

    operations.map((oper, index)=>{
        if(oper === "+")
            score.push(score[score.length-2]+score[score.length-1]);
        else if(oper === "C") 
            score.pop();
        else if(oper === "D")
            score.push(score[score.length-1]*2);
        else 
            score.push(parseInt(oper));
    })
    return sum(score);
};

var sum = (score) => {
    return score.reduce((acc, curr)=> acc+curr,0 );
}