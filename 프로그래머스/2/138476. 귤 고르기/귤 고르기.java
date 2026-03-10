import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 중복된 귤의 크기를 세기 위해 map 활용
        Map<Integer, Integer> map = new HashMap<>();
        
        // getOrDefault 메서드를 활용
        // 이미 map에 값이 존재한다면 기존 값을 반환, 없다면 0을 반환
        // 여기에 +1을 해줌으로써 중복되는 갯수를 셀 수 있다
        for(int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        // map.values()는 map의 모든 값들을 출력하는 메서드
        // list 생성시에 map.values()를 사용해서 모든 값들을 넣는다
        List<Integer> list = new ArrayList<>(map.values());
        
        // list를 역순으로 정렬하여 중복된 갯수가 많은 순으로 정렬
        list.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < list.size(); i++) {
            k -= list.get(i);
            answer++;
            
            if(k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}