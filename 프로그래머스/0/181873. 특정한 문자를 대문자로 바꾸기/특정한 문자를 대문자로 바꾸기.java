class Solution {
    public String solution(String my_string, String alp) {
        char[] cha = my_string.toCharArray();
        
        for(int i = 0; i < cha.length; i++) {
            if(cha[i] == alp.charAt(0)) {
                cha[i] = Character.toUpperCase(cha[i]);
            }
        }
        
        return String.valueOf(cha);
    }
}