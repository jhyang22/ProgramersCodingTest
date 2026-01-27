import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();        
            
            // 10진수를 2진수로 변환하는 과정
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);
            
            // 만약 arr1[i] 가 5일 경우
            // a는 101이 나오는데 
            // n이 5자리인 경우엔 00101이 되어야 한다
            // 따라서 자릿수를 맞춰주기 위해 아래와 같은 과정이 필요하다
            // format("%" + n + "s", a) 의 의미는 문자열을 최소한 n의 길이로 맞추라는 의미
            // 예를 들어 a가 101이고 n이 5라면 5자리를 맞추기 위해 101 앞에 2개의 공백이 생긴다
            // 그리고 그 공백을 replace(' ', '0')을 이용하여 0으로 만드는 것
            a = String.format("%" + n + "s", a).replace(' ', '0');
            b = String.format("%" + n + "s", b).replace(' ', '0');
            
            for(int j = 0; j < n; j++) {
                if(a.charAt(j) == '1' || b.charAt(j) == '1') {
                    str.append('#');
                } else {
                    str.append(' ');
                }
            }
            
            answer[i] = str.toString();
        }
        
        return answer;
    }
}