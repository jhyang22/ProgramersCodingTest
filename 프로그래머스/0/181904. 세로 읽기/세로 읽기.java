import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> strList = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i+=m) {
            strList.add(my_string.substring(i, i + m));
        }
        
        for(int i = 0; i < strList.size(); i++) {
            answer.append(strList.get(i).charAt(c - 1));
        }
        
        return answer.toString();
    }
}