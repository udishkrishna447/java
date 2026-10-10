class Solution {
    public int firstUniqChar(String s) {
         int freq[]= new int[26];
         for(int i=0;i<s.length();i++){
            int value=s.charAt(i)-'a';
            freq[value]++;
         }
         for(int i=0;i<s.length();i++){
            int value=s.charAt(i)-'a';
            if(freq[value]==1){
                return i;
            }
         }
         return -1;
    }
}