class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 이렇게 하니까 정답은 도출하지만 효율성에서 에러!
//         for(int i = 2; i <= n; i++) {
//             int num = 0;
            
//             for(int j = 1; j <= i; j++) {
//                 if(i % j == 0) {
//                     num++;
//                 }
//             }
            
//             if(num == 2) {
//                 answer++;
//             }
//         }
        
        for(int i = 2; i <= n; i++) {
            // 소수 판결을 위한 boolean을 만들어주고
            boolean bool = true;
            
            // 모든 수는 1로 나뉘어지기 때문에 j는 2부터 시작
            // 예를들어 i가 3이라면 j는 2부터 시작하기 때문에 2 * 2 <= 3 부분이 성립이 안되어 boolean은 true인 상태로 지나간다
            // 문제에서는 소수를 찾는 것이고, 소수는 1과 자기자신만을 약수로 가지기 때문에 
            // 제곱근(j * j = i)인 상황이 나오게되면 boolean을 false로 주고 바로 break 하여 효율성을 높여준다
            for(int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    bool = false;
                    break;
                }
            }
            
            if(bool) {
                answer++;
            }
        }
        
        
        return answer;
    }
}