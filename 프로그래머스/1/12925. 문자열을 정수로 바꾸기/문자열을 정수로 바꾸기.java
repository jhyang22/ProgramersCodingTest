class Solution {
    public int solution(String s) {
        int answer = 0;
        
        try {
        answer = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        return answer;
    }
}