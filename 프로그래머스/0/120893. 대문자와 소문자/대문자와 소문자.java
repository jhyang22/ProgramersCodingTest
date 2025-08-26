import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] charStr = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isUpperCase(charStr[i])) {
                charStr[i] = Character.toLowerCase(charStr[i]);
            } else {
                charStr[i] = Character.toUpperCase(charStr[i]);
            }
        }
        
        return String.valueOf(charStr);
    }
}