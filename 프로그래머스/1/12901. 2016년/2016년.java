class Solution {
    public String solution(int a, int b) {
        
        int[] dayArr = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int days = 0;
        
        for(int i = 0; i < a - 1; i++) {
            days += dayArr[i];
        }
        
        days += b;
        
        String[] week = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        int num = days % 7;
        
        String answer = week[num];
        
        return answer;
    }
}