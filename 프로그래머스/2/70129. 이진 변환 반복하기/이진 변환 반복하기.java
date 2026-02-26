class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int len = 0;
        
        String str = s;
        
        while(!str.equals("1")) {
            // 0 제거
            String removeZero = str.replace("0", "");
            
            // 제거된 0의 갯수 
            len += str.length() - removeZero.length();
            
            // 제거된 후의 길이를 2진법으로 변환
            str = Integer.toBinaryString(removeZero.length());
            
            // 회차 추가
            count++;
        }
        
        answer[0] = count;
        answer[1] = len;
        
        return answer;
    }
}