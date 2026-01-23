import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 배열의 내림차순은 Coollections.reverseOrder()를 사용해야하는데 
        // 이는 기본형은 허용이 안되므로 래퍼클래스로 박싱해야한다
        Integer[] integerArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        
        Arrays.sort(integerArr, Collections.reverseOrder());
        
        for(int i = 0; i < integerArr.length; i += m) {
            if(i + m - 1 >= integerArr.length) {
                break;
            }
            
            answer += integerArr[i + m - 1] * m;
        }
        
        return answer;
    }
}