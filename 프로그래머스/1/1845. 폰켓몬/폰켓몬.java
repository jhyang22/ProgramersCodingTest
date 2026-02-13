import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        // 포켓몬 종류의 갯수를 map의 크기로 파악하기 위함
        HashMap<Integer, Integer> map = new HashMap<>();
            
        // putIfAbsent는 존재한다면 기존 값을 반환, 없다면 값을 저장하는 메서드
        for(int num : nums) {
            map.putIfAbsent(num, 1);
        }
            
        int size = map.size();
        int count = nums.length / 2;
        
        // 문제의 예제 3번처럼 [3, 3, 3, 2, 2, 2] 인 경우 
        // count는 3, size는 2가 된다
        // 따라서 size >= count ? size : count 가 아닌 아래가 정답이 된다
        // (종류가 더 많더라도 선택할 수 있는 갯수가 2개뿐이라면 2개밖에 선택이 안되기 때문)
        return size >= count ? count : size;
    }
}