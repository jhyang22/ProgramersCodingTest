class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 한 자리 수가 아닌 경우를 계산하기 위한 임시 변수
        int temp = 0;
        
        for(char c : my_string.toCharArray()) {
            // isDigit 함수는 () 안의 char 값이 숫자인지를 판별하는 메서드
            if(Character.isDigit(c)) {
                // getNumericValue 함수는 숫자 형태의 char를 int형으로 변환하는 메서드
                // 연속된 숫자의 경우 10을 곱해주어 자릿수를 늘려준다
                // 예를 들어 12의 경우 첫 번째 char은 1, 두 번째 char는 2인데 1에 10을 곱해주어 12를 만드는 형식
                temp = temp * 10 + Character.getNumericValue(c);
            } else {
                // 연속된 숫자가 끝나고 다시 문자가 생기면 기존 temp를 answer에 더해준 후 temp를 초기화한다
                answer += temp;
                temp = 0;
            }
        }
        
        // 만약 my_string의 마지막이 숫자로 끝나는 형태라면
        // for문에서는 마지막 숫자는 더해주지 않으므로 for문 밖에서 더해줘야 제대로 된 값을 반환할 수 있다
        answer += temp;
        
        return answer;
    }
}