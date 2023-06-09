class Solution {
    public int mySqrt(int x) {
        double srt = x / 2 ;
        double temp;
        if(x == 0 || x == 1 ) return x;
        do{
            temp = srt;
            srt = (temp + (x / temp)) / 2 ;

        }while((temp - srt) != 0);

        return (int)srt;
    }
}