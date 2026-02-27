class Solution {
    public int solution(int n) {
        int answer = n;
        
        while(n > 0) {
            answer++;
            
            // Integer.bitCount() 는 2진수에서 1의 갯수를 세는 함수
            if(Integer.bitCount(n) == Integer.bitCount(answer)) {
                return answer;
            }
        }
        
        return answer;
    }
}