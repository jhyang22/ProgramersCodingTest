import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        
        char[] charAnswer = answer.toCharArray();
        
        Arrays.sort(charAnswer);
        
        return String.valueOf(charAnswer);
    }
}