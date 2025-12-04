import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> str = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            // i번째 인덱스부터 끝까지 자르는 과정(접미사)
            str.add(my_string.substring(i));
        }
        
        String[] answer = str.toArray(new String[0]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}