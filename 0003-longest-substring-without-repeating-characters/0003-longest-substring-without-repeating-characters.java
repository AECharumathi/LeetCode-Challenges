class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String str = "";
       for(int  i = 0; i< s.length() ; i++){
           char curr = s.charAt(i);
               if(str.indexOf(curr) == -1){
                   str += curr;
                    if(max < str.length()) max = str.length();
               }else{
                  str = str.substring(str.indexOf(curr)+1)+String.valueOf(curr);
               }
       }
        return max;
    }
}