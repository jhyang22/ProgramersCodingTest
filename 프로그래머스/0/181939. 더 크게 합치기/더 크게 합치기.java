class Solution {
    public int solution(int a, int b) {
        
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        
        int numA = Integer.parseInt(strA + strB);
        int numB = Integer.parseInt(strB + strA);
        
        if(numA > numB) {
            return numA;
        } else {
            return numB;
        }
    }
}