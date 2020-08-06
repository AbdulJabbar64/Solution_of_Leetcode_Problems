
//package Leetcode;

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int val: nums){
            if(max1 <= val){
                max2 = max1;
                max1 = val;
                //System.out.println(max1+"     2  "+max2);
            }else if(max2 <= val){
                max2 = val;   
            }   
        }
        return (max1 - 1)*(max2 -1);
    }
}