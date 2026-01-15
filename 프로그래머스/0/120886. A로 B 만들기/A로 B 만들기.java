import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] charB = before.toCharArray();
        char[] charA = after.toCharArray();
        
        Arrays.sort(charB);
        Arrays.sort(charA);
        
        if(Arrays.equals(charA, charB)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}