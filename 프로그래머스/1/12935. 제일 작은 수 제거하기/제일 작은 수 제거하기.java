import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1];
        
        if(arr.length == 1) {
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
               
            int x = arr[0];
            for(int a : arr) {
                if(x > a) {
                    x = a;
                }
            }

            boolean flag = false;
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != x) {
                    if(flag) {
                        answer[i-1] = arr[i];
                    } else {
                        answer[i] = arr[i];
                    }
                } else {
                    flag = true;
                }
            }
        }
        
        return answer;
    }
}


    