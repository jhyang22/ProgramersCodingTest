import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answerList.add(arr[i]);
            } 
        }
        
        Collections.sort(answerList);
        
        answer = answerList.stream().mapToInt(i -> i).toArray();
        
        if (answer.length == 0) {
            answer = new int[]{-1};
        }
        
        
        return answer;
    }
}