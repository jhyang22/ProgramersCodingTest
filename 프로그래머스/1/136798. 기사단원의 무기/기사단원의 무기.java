class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int num = 0;
            
            // 이렇게 했더니 number가 엄청나게 커지면 연산과정이 오래걸려 시간 초과가 나온다!
            // for(int j = 1; j <= i; j++) {
            //     if(i % j == 0) {
            //         num++;
            //     }
            // }
            
            // 수정버전
            // 약수 문제는 제곱근을 생각하기!
            // 예를 들어 i가 6인 경우
            // 1 * 6, 2 * 3, 3 * 2, 6 * 1
            // 약수는 1, 2, 3, 6이 나옴
            // 근데 3, 6의 경우 1, 2의 짝이기 때문에 굳이 계산하지 않고 1, 2를 계산할 때 num에 더해주는 것
            // 여기서 만약 i가 4라면
            // 약수는 1, 2, 4가 나온다
            // 2를 중복 계산하지 않기 위해 (i != j * j) 조건을 넣어주는 것!
            for(int j = 1; j * j <= i; j++) {
                if(i % j == 0) {
                    num++;
                    
                    if(i != j * j) {
                        num++;
                    }
                }
            }
            
            if(num > limit) {
                answer += power;
            } else {
                answer += num;
            }
        }
        
        return answer;
    }
}