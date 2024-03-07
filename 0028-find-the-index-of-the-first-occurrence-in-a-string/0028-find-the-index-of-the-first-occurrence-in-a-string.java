class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
           String temp = haystack.substring(i,needle.length()+i);
           if(temp.equals(needle)){
               return i;
           }
        }
        return -1;
    }
}