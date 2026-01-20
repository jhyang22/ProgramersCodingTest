import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        // 처음엔 switch를 사용하여 하드코딩하였으나 name의 가변성을 위해 Map을 사용하여 매핑함
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            int num = 0;
            
            for(String s : photo[i]) {
                // map.getOrDefault(a, b) 
                // map에서 a 키 값을 가져오는데 없으면 b를 사용한다는 의미
                num += map.getOrDefault(s, 0);
            }
            
            answer[i] = num;
        }
        
        return answer;
    }
}