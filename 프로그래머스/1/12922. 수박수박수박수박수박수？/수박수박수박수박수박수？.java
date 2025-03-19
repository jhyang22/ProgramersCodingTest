import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(int n) {
        String answer = "";
        
        List<String> strList = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0){
                strList.add("수");
            } else {
                strList.add("박");
            }
        }
        
        answer = String.join("",strList);
        
        return answer;
    }
}