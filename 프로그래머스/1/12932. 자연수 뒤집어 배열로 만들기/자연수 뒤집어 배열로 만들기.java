import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {

        ArrayList<Integer> answer = new ArrayList<>();
        while(n > 0) {
            Long a = n % 10;
            answer.add(a.intValue());
            n = n / 10;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }    
}