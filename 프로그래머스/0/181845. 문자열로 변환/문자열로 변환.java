class Solution {
    public String solution(int n) {
        
        // return n + "";
        
        // return Integer.toString(n);
        
        // return String.valueOf(n);
        
        // %d : 정수를 10진수 형태로 출력하라는 의미
        // % : 포맷 시작 의미
        // d : decimal(10진수 정수)을 의미
        return String.format("%d", n);
    }
}