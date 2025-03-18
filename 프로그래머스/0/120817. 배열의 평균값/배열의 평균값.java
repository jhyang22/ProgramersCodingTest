class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sumNum = 0;
        
        for(int i = 0; i < numbers.length; i++) {
           sumNum += numbers[i];
        }
        
        answer = sumNum / numbers.length;
                
        return answer;
    }
}