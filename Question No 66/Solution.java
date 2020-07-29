
//package Leetcode;

class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length - 1;
	    for (int i = l; i >= 0; i--) {
		    if (digits[i] != 9){
			    digits[i]++;
			    return digits;
		    } else {
			    digits[i] = 0;
			    if (i == 0) {
				    digits = new int[l + 2];
				    digits[i] = 1;
			    }
		    }                
	    }
	    return digits;
    }
}