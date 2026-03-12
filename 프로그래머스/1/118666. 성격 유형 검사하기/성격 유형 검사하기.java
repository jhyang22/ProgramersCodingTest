import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        int[] score = {3, 2, 1, 0 , 1, 2, 3};
        
        // 성격 유형들과 점수를 저장하기 위한 map
        Map<Character, Integer> map = new HashMap<>();
        
        // key 설정을 해준다
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for(char c : type) {
            map.put(c, 0);
        }
        
        // for문으로 점수계산을 해주고
        for(int i = 0; i < choices.length; i++) {
            int n = choices[i];
            
            if(n < 4) {
                char c = survey[i].charAt(0);
                map.put(c, map.get(c) + score[n - 1]);
            } else if(n > 4) {
                char c = survey[i].charAt(1);
                map.put(c, map.get(c) + score[n - 1]);
            }
        }
        
        // 점수를 비교하여 만약 동일 점수라면 문제에서 제시한 사전순으로 성격 유형을 부여한다
        answer += map.get('R') >= map.get('T') ? "R" : "T";
        answer += map.get('C') >= map.get('F') ? "C" : "F";
        answer += map.get('J') >= map.get('M') ? "J" : "M";
        answer += map.get('A') >= map.get('N') ? "A" : "N";
                
        return answer;
    }
}