class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];

            for(int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
        } else {
            answer[0] = numbers[1];
            answer[numbers.length - 1] = numbers[0];
            
            for(int i = 2; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
            }
        }
        
        return answer;
    }
}