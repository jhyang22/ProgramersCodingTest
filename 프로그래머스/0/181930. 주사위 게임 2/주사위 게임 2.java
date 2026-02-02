class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a == b && b == c) {
            answer = cal3(a, b, c);
        } else if(a == b || a == c || b == c) {
            answer = cal2(a, b, c);
        } else {
            answer = cal1(a, b, c);
        }        
        
        return answer;
    }
    
    public static int cal1(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    public static int cal2(int num1, int num2, int num3) {
        return (num1 + num2 + num3) * (num1 * num1 + num2 * num2 + num3 * num3);
    }
    
    public static int cal3(int num1, int num2, int num3) {
        return (num1 + num2 + num3) * (num1 * num1 + num2 * num2 + num3 * num3) * (num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3);
    }
}