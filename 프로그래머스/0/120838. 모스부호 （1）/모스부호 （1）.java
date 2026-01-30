import java.util.*;

class Solution {
    public String solution(String letter) {
        
        String[] morse = {".-:a", "-...:b", "-.-.:c", "-..:d", ".:e", "..-.:f", "--.:g", "....:h", "..:i", ".---:j", "-.-:k", ".-..:l", "--:m", "-.:n", "---:o", ".--.:p", "--.-:q", ".-.:r", "...:s", "-:t", "..-:u", "...-:v", ".--:w", "-..-:x", "-.--:y", "--..:z"};
        
        Map<String, String> map = new HashMap<>();
        
        for(String s : morse) {
            String[] strArr = s.split(":");
            map.put(strArr[0], strArr[1]);
        }
        
        String[] letterArr = letter.split(" ");
        
        StringBuilder answer = new StringBuilder();
                
        for(String s : letterArr) {
            answer.append(map.get(s));
        }
        
        return answer.toString();
    }
}