import java.util.stream.*;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        int[] numArray = Stream.of(num_str.split(""))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        for(int i = 0; i < numArray.length; i++) {
            answer += numArray[i];
        }
        
        return answer;
    }
}