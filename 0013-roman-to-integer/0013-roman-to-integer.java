class Solution {
    public int romanToInt(String s) {
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        int val = 0, value = 0 ;
        char prev = 'a';
        for(char a : s.toCharArray()){
            switch(a){
            case 'I':
                val += 1;
                break;
            case 'V':
                val += 5;
                break;
            case 'X':
                val += 10; 
                break;
            case 'L':
                val += 50;
                break;
            case 'C':
                val += 100;
                break;
            case 'D':
                val += 500;
                break;
            case 'M':
                val += 1000;
                break;
            }
            if(prev == 'I' && (a == 'V' || a == 'X')){
                val -=2;
            }else if(prev == 'X' && (a == 'L' || a == 'C')) {
                val -=20;
            }else if(prev == 'C' && (a == 'D' || a == 'M')){
                val -=200;
            }
            prev = a;
        }
        return val;
    }
}