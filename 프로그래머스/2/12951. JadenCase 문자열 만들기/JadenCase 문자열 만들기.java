import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        
        // 첫 글자를 가려내기 위한 boolean
        boolean word = true;
        
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == ' ') {
                word = true;
            } else {
                if(word) {
                    charArr[i] = Character.toUpperCase(charArr[i]);
                    word = false;
                } else {
                    charArr[i] = Character.toLowerCase(charArr[i]);
                }
            }
        }
        
        answer = String.valueOf(charArr);
        
        return answer;
    }
}