class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        Arrays.sort(strs);
        if(strs.length > 1 ){
             int index = 0, top = 0, end = strs.length-1;
             while(index < strs[top].length() && index < strs[end].length()){
                 if(strs[top].charAt(index) == strs[end].charAt(index)){
                     String prefix = String.valueOf(strs[top].charAt(index));
                     str = str.concat(prefix);
                 }else{
                     return str;
                 }
                 index++;
             }
             return str;
         }else{
             return strs[0];
         }
               
        
    }
}