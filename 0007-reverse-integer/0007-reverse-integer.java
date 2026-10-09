class Solution {
    public int reverse(int x) {
        int dig,rev=0;
        while(x!=0){
            dig=x%10;
            x=x/10;
            if(rev < Integer.MIN_VALUE/10 || rev > Integer.MAX_VALUE/10){
            return 0;
            }
           rev=rev*10+dig;
        }
        return rev;
    }
}