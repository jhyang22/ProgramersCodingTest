import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A') {
                str.append("A");
            } else {
                str.append(Character.toLowerCase(myString.charAt(i)));
            }
        }
        
        return str.toString();
    }
}