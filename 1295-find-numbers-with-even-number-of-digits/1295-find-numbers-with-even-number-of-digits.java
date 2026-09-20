class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            int k=0;
             while(n>0){
                 n=n/10;
                 k++;
             }
             if(k%2==0){
                count++;
             }
        }
        return count;
    }
}