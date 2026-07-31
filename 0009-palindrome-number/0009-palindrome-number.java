class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0,dig;
        while(x>0){
            dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(temp==rev)
            return true;
        else
            return false;
    }
}