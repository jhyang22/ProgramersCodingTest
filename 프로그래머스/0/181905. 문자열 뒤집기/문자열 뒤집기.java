class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String str1 = my_string.substring(0, s);
        String str2 = my_string.substring(s, e + 1);
        String str3 = my_string.substring(e + 1);
        
        String strRev = "";
        for(int i = str2.length() - 1; i >= 0; i--) {
            strRev += str2.charAt(i);
        }
        
        answer = str1 + strRev + str3;
        
        return answer;
    }
}