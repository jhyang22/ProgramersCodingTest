class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = 0;        
        
        for (int i = 0; i <=(n-1); i++) {
            a += x;
            answer[i] = a;            
        }
        
        return answer;
    }
}