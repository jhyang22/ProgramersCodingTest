import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                list.add(arr[i] / 2);
            } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                list.add(arr[i] * 2);
            } else {
                list.add(arr[i]);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}