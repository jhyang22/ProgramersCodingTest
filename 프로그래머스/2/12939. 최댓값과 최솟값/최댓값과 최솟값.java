class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        
        for(int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            
            if(max < num) {
                max = num;
            }
            
            if(min > num) {
                min = num;
            }
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}