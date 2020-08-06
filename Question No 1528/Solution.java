
//package Leetcode;

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            //System.out.println("Indice 1   "+indices[i]+"  Char 1  "+s.charAt(i));
            ch[indices[i]]=s.charAt(i);
            //System.out.println("Indice   "+indices[i]+"  Char  "+s.charAt(i));
        }
        return new String(ch);
    }
}

