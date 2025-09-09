class Solution {
    public int solution(int n, String control) {
        char[] charControl = control.toCharArray();
        
        for(int i = 0; i < charControl.length; i++) {
            if(charControl[i] == 'w') {
                n += 1;
            }
            if(charControl[i] == 's') {
                n -= 1;
            }
            if(charControl[i] == 'd') {
                n += 10;
            }
            if(charControl[i] == 'a') {
                n -= 10;
            }
        }
        
        return n;
    }
}