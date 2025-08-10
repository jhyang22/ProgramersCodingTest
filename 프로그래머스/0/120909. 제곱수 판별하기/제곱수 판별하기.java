class Solution {
    public int solution(int n) {
        
        double a = Math.sqrt(n);
        
        if(a % 1 == 0) {
            return 1;
        }
        
        return 2;
    }
}