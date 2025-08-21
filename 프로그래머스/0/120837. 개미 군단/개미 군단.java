class Solution {
    public int solution(int hp) {
        int a = 0;
        int b = 0;        
        int c = 0;
        
        a = hp / 5;
        
        if(hp % 5 > 0) {
            b = (hp % 5) / 3;
        }
        
        if((hp % 5) % 3 > 0) {
            c = ((hp % 5) % 3);
        }
        
        
        return a + b + c;
    }
}