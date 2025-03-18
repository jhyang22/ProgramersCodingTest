class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int originalX = x;
        
        int a = 0;
        while (x > 0) {
            a += x % 10;    
            x /= 10;                
        }
        
        if (originalX % a == 0) {
            return answer;    
        } else {
            answer = false;
            return answer;
        }
    }
}

// 1. 각 자리 숫자를 구한다
// 2. 각 자리 숫자를 더한다
// 3. x를 더한 값으로 나눴을 때 나머지가 0이면 반환