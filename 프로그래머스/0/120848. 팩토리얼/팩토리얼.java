class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        int i = 1;
        
        while(true) {
            a *= i;
            
            if(a > n) {
                break;
            }
            
            answer++;
            i++;
        }        
        
        return answer;
    }
}