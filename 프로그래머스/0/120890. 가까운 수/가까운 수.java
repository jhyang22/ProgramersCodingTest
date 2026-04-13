class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < array.length; i++) {
            int num = array[i];
            
            // Math.abs() 는 절대값을 구하는 함수
            a = Math.abs(answer - n);
            b = Math.abs(num - n);
            
            if(a > b || (a == b && answer > num)) {
                answer = num;
            }     
        }
        
        return answer;
    }
}