import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            boolean bool = false; // 검증 하기 위한 변수. bool이 false라면 리스트에 더하기.
            
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    bool = true; // 같은 수가 있다면 bool은 true. 즉, 리스트에 더하지 않는다.
                }
            }
            
            if(!bool) {
                list.add(arr[i]); // bool이 false라면 리스트에 더한다.
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}