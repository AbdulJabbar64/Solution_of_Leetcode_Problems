
//package Leetcode;

class Solution {
    ArrayList <String> array=new ArrayList<String>();
    public List<String> fizzBuzz(int n) {
        for(int i=1;i<=n;i++){
            if(i%3==0 | i%5==0){
            }else{
                array.add(String.valueOf(i));
            }
            if(i%3==0 && i%5==0){
                array.add("FizzBuzz");
            }
            else
            {
                if(i%3==0){
                array.add("Fizz");
                }
                if(i%5==0){
                    array.add("Buzz");
                }
            }
        }
        return array;
    }
}