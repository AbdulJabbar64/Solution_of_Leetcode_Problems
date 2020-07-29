
//package Leetcode;

public class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defanging_IP =new StringBuilder();
        for(int i=0;i<address.length();i++){
            Character ch=new Character(address.charAt(i));
            if(ch.equals('.'))
                defanging_IP.append("[.]");
            else
                defanging_IP.append(ch);
        }
        return defanging_IP+"";
    }
}
