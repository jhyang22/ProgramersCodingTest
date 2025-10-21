class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        // trim() : 문자열의 앞 뒤 공백 제거
        // \\s+ : \s는 공백 문자 의미, +는 문자가 하나 이상 반복됨을 의미. 즉, 공백이 하나이상이다를 의미하는 정규식
        answer = my_string.trim().split("\\s+");
        
        return answer;
    }
}