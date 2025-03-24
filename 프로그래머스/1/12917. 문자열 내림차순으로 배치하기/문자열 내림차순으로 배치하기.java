import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sList = s.split("");
        Arrays.sort(sList, Collections.reverseOrder());
        
        answer = String.join("", sList);
        
        return answer;
    }
}