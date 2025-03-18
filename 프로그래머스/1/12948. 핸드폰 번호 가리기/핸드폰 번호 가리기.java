import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String[] arr = phone_number.split("");
        int index = arr.length - 5;
        
        for(int i = 0; i <= index; i++) {
            arr[i] = "*";
        }
        
        answer = String.join("", arr);
        // answer = Arrays.toString(arr);
        
        return answer;
    }
}

// 1. 문자열 길이를 구한다
// 2. 뒤 4자리 인덱스를 구한다
// 3. 나머지를 바꿔준다
// 4. 실패

// 1. 문자열을 배열로 바꾼다
// 2. 뒤 4자리 인덱스를 구한다
// 3. 2번의 인덱스까지 for문으로 하나하나 바꿔준다
// 4. 다시 문자열로 바꾼다