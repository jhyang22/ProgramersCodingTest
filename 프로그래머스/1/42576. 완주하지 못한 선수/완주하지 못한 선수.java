import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자를 카운트 하는 과정
        for(String s : participant) {
            // getOrDefault를 사용하여 map에 s가 있다면 그 값을 가져오고 없다면 0을 반환한다!
            // 여기에 1을 더함으로써 초기값은 1(0 + 1), 이후 중복값부턴 2, 3, 4...가 된다
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        // 완주자를 차감하는 과정
        // 위 for문에서 참가자를 +1 해줬으므로 완주자 카운트에서 -1을 해줌으로써 마지막 for문에서 0이 아닌 사람은 완주하지 못한 사람이 된다
        for(String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        
        // 값이 0이 아닌 사람을 찾는 과정
        for(String s : map.keySet()) {
            if((map.get(s) != 0)) {
                return s;
            }
        }
        
        return "";
    }
}