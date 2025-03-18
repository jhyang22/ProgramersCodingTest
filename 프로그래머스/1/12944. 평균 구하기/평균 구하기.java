class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sumArr = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        
        answer = sumArr / arr.length;
        
        return answer;
    }
}