class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int c = 0;
        
        while(n >= a) {
            c = (n / a) * b;
            n = c + (n % a);
            answer += c;
        }
            
        return answer;
    }
}