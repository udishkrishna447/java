class Solution {
    public int[] getConcatenation(int[] nums) {
        int res[]= new int[2*nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            res[i+n]=nums[i];
        }
        return res;
    }
}