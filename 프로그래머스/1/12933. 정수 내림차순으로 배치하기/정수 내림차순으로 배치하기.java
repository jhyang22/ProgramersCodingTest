import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public long solution(long n) {                
        ArrayList<Long> listArray = new ArrayList<Long>();

        while(n > 0) {
            listArray.add(n%10);
            n /= 10;
        }
        
        Long[] array = listArray.toArray(new Long[0]);
        
        Arrays.sort(array, Collections.reverseOrder());
        
        StringBuilder a = new StringBuilder();
        for (long num : array) {
            a.append(num);
        }
        
        return Long.parseLong(a.toString());
    }
}
