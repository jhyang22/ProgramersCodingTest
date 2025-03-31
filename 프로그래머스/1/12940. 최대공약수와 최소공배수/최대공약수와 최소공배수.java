class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = 0;
        int lcm = 0;        
        
        int min = Math.min(n, m);
        
        for(int i = 1; i <= min; i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;        
            }
        }
        
        lcm = (n * m) / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
}