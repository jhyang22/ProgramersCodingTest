import java.util.stream.*;

class Solution {
    public int solution(int num, int k) {
        // Stream.of()는 () 안의 배열을 Stream 하는 과정
        int[] arrayNum = Stream.of(String.valueOf(num).split("")) // 정수형을 문자열로 바꾼 후 문자열 배열로 바꾸는 과정
                                  .mapToInt(Integer::parseInt) // Stream<String> -> IntStream
                                  .toArray();
        
        for(int i = 0; i < arrayNum.length; i++) {
            if(arrayNum[i] == k) {
                return i + 1;
            }
        }
        
        return -1;
    }
}