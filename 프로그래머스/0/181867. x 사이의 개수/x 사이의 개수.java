import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>(); 
        
        // 여기서 -1을 주는 이유
        // -1이 없다면 마지막 빈 문자열은 버린다.
        // 즉, myString.split("x"); 만 하게 된다면 oxoox 같은 경우 ["o", "oo"] 가 결과로 나오게 되고
        // 리턴값은 [1,2] 까지만 나오게 된다.
        // 따라서 -1을 줌으로써 마지막 빈 문자열을 포함시켜 ["o", "oo", ""] 가 결과로 나오게 하여
        // 리턴값으로 [1, 2, 0] 이 나오게 한다.
        String[] arr = myString.split("x", -1);
        
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i].length());
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}