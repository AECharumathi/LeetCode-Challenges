/**
 * @param {Function} fn
 * @return {Function}
 */
var curry = function(fn) {
    return function curried(...args) {
        if(args.length >= fn.length) 
          return fn.apply(this,args);
        return (...arg)=> curried.apply(this, args.concat(arg));
    };
};

/**
 * function sum(a, b, c) { return a + b + c; }
 * const csum = curry(sum);
 * csum(1)(2) // 3
 */
