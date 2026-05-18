import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // 오름차순 정렬
        Arrays.sort(people);
        
        // 정렬된 people 배열에서 가장 가벼운 사람 a, 가장 무거운 사람 b
        int a = 0;
        int b = people.length - 1;
        
        while(a <= b) {
            // 사람을 두 명 태울 수 있는 경우, 둘 다 배에 탑승
            if(people[a] + people[b] <= limit) {
                a++;
            }
            
            // 만약, 조건문에 해당하지 않는 경우(두 명을 태울 수 없는 경우), 가장 무거운 사람 혼자 배에 탑승
            b--;
            answer++;
        }
        
        return answer;
    }
}