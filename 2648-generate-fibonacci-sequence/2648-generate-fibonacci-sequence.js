/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    var x =0,  y = 1;
    yield x;
    yield y; 
    while(true){
        var sum = x+y;
        yield sum;
        x=y; y=sum;
    }
    
};



/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */