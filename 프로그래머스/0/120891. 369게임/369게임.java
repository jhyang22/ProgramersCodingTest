import java.util.stream.Stream;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        int[] numArr = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
        // int는 기본형이기 때문에 Stream을 사용하려면 Stream.of()를 사용해야 한다
        // String.valueOf()의 결과는 String. 따라서 mapToInt로 Integer로 바꿔주는게 필요
        
        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] == 3 || numArr[i] == 6 || numArr[i] == 9) {
                answer++;
            }
        }
        
        return answer;
    }
}