import java.util.stream.Stream;
import java.util.*;

class Solution {
    public String solution(int age) {
        StringBuilder str = new StringBuilder();
        
        // String.valueOf(age) : 정수를 문자열로 바꾸는 과정
        // 그 후 문자열을 쪼갠 뒤 mapToInt와 toArray로 정수형 배열로 만든다
        // Stream.of : 문자열 배열을 stream으로 감싸서 흐름 형태로 한 개씩 처리하는 과정 (순차적으로 흐름 생성)
        int[] intArr = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int i = 0; i < intArr.length; i++) {
            switch(intArr[i]) {
                case 0 : str.append("a");
                    break;
                case 1 : str.append("b");
                    break;
                case 2 : str.append("c");
                    break;
                case 3 : str.append("d");
                    break;
                case 4 : str.append("e");
                    break;
                case 5 : str.append("f");
                    break;
                case 6 : str.append("g");
                    break;
                case 7 : str.append("h");
                    break;
                case 8 : str.append("i");
                    break;
                case 9 : str.append("j");
                    break;
            }
        }
        
        return str.toString();
    }
}