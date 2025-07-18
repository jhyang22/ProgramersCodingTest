class Solution {
    public int solution(String number) {
        int answer = 0;
        int num = 0;
        
        char[] charNum = number.toCharArray();
        
        for(int i = 0; i < charNum.length; i++) {
            num += charNum[i] - '0';
        }
        
        answer = num % 9;
        
        return answer;
    }
}