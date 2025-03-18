class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(!(num == 1)){
            if(num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
            }
            answer++;
            
            if (answer > 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}

// 1. 짝수/홀수 판별
// 2. 그에 따른 수식 진행
// 3. 몫이 0, 나머지가 1일때까지 진행?
// 몇 번 반복하는지를 반환해야하네?
