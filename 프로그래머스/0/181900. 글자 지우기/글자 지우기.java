import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        List<String> strList = new ArrayList<>(Arrays.asList(my_string.split("")));
        
        // 정렬을 안한채로 for문 돌리면 인덱스가 앞당겨질 수 있다
        // 예를들어 문제의 예시의 경우 1번 인덱스가 먼저 삭제되며 
        // [a, p, o, r, ..., m, p, r, s] 가 남게 되고 
        // 다음 for문에서 16번 인덱스는 기존의 m이 아닌 내가 의도하지 않았던 p가 삭제되게 된다
        // 따라서 내림차순으로 정렬 후 for문을 역순으로 돌림으로써 이러한 문제를 방지할 수 있다.
        Arrays.sort(indices);
        
        for(int i = indices.length - 1; i >= 0; i--) {
            strList.remove(indices[i]);
        }
        
        // 리스트 안에 있는 문자열들을 ""(아무것도 없는 구분자)로 이어 붙여라 라는 의미
        // 배열의 경우 Arrays.toString(arr); 이런 식으로 해결이 가능했지만
        // 리스트의 경우 이렇게 해야한다
        return String.join("", strList);
    }
}