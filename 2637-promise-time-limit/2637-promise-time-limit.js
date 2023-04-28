/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
	return async function(...args) {
        const func = new Promise((resolve)=> resolve(fn(...args)));
        const timeLimit = new Promise((_,reject)=>
            setTimeout(()=>reject("Time Limit Exceeded","time"), t)
            );
        return Promise.race([func, timeLimit]);
    }
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */