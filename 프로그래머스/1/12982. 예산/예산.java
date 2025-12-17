import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int num = 0;
        
        for(int i = 0; i < d.length; i++) {
            if(budget - d[i] >= 0) {
                budget = budget - d[i];
                num++;
            } else {
                break;
            }
        }
        
        return num;
    }
}