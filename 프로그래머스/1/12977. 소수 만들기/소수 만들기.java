class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int h = j + 1; h < nums.length; h++) {
                    int num = nums[i] + nums[j] + nums[h];
                    
                    answer += cal(num);
                }
            }
        }

        return answer;
    }
    
    public static int cal(int num) {
        int a = 0;
        
        if(num == 0 || num == 1) {
            return 0;
        }
        
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                a++;
            }
        }
        
        if(a <= 2) {
            return 1;
        }
        
        return 0;
    }
}