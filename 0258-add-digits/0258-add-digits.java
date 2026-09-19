class Solution {
    public int addDigits(int num) {
        while(num>=10){
        int dig,sum=0;
        while(num>0){
            dig=num%10;
            sum+=dig;
            num/=10;
        }
        num=sum;
        }
        return num;
    }
}