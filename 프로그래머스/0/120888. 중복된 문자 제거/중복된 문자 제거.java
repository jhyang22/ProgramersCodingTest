import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // set의 특징
        // 1. 순서 보장 x
        // 2. 중복 x
        // 그러나 LinkedHashSet은 순서를 보장한다!
        LinkedHashSet<String> strSet = new LinkedHashSet<>();
        
        String[] strArr = my_string.split("");
        
        for(String s : strArr) {
            strSet.add(s);
        }
        
        answer = String.join("", strSet);
        
        return answer;
    }
}