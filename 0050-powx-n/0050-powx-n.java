class Solution {
    private double power(double x , long n){
        if( n == 0 )
            return (1);      
        if(n % 2 == 0) return power( x * x , n/2 );
        else return x * power( x * x , (n-1)/2 ) ;
    }
    public double myPow(double x, int n) {
        if (n < 0 ){
           return 1.0 / power( x ,(long)-1 * n );
        }
        return power(x, (long) n);
    }
}