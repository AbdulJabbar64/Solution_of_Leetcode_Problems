
//package Leetcode;

class Solution {
    public int arrangeCoins(int n) {
       long sum=0;
        int k=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            if(sum<=n)
                k++;
            else
                break;
        }
        return k;
    }
}