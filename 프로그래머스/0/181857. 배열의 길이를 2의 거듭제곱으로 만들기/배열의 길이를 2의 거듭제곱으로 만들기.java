import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int n : arr) {
            list.add(n);
        }
        
        int pow = 0;
        int mathPow = 1;
        
        while(mathPow < arr.length) {
            pow++;
            mathPow = (int) Math.pow(2, pow);
        }
        
        for(int i = 0; i < mathPow - arr.length; i++) {
            list.add(0);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}