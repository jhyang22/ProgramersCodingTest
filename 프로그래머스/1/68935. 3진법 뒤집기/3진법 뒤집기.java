class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String base3 = Integer.toString(n, 3);
        
        StringBuffer base3Buffer = new StringBuffer(base3);
        
        String reverse = base3Buffer.reverse().toString();
        
        answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}