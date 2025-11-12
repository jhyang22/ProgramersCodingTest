import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            str.append(my_string.charAt(i));
        }
        
        return str.toString();
    }
}