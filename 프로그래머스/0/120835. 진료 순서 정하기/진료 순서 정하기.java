import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        // Object의 .clone() 메서드를 활용하여 배열을 복사
        int[] sorted = emergency.clone();
        
        Arrays.sort(sorted);
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] == sorted[j]) {
                    answer[i] = emergency.length - j;
                }
            }
        }
        
        return answer;
    }
}