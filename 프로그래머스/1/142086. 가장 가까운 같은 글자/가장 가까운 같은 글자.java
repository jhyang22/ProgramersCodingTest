import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> idx = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            // idx Map의 Key에 동일한 문자가 있었다면~
            if(idx.containsKey(s.charAt(i))) {
                // i와 Value의 차이만큼 ans에 넣는다
                ans.add(i - idx.get(s.charAt(i)));
            } else {
                ans.add(-1);
            }
            
            // 동일한 문자가 있을 경우 Value 갱신
            idx.put(s.charAt(i), i);
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}