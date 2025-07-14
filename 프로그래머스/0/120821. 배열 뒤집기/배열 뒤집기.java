import java.util.Collections;
import java.util.Arrays;
import java.util.List;


class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length]; // num_list의 길이와 같은 배열 생성
        int num = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            num = num_list.length - (i+1); // num에 가장 끝자리 인덱스를 넣어줌
            
            answer[i] = num_list[num]; // 뒤집기!
        }
        
        return answer;
    }
}