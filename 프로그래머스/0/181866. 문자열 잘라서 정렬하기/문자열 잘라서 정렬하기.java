import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();

        // 빈 문자열도 제거하는 과정
        for(String str : arr) {
            if(!str.isEmpty()) {
                list.add(str);
            }
        }
                
        String[] answer = list.toArray(new String[0]);
        
        Arrays.sort(answer);
            
        return answer;
    }
}