class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char a;
        String b;
        
        String[] sSplit = s.split(" ", -1);
        
        for(int i = 0; i < sSplit.length; i++) {
            b = sSplit[i];
            for(int j = 0; j < b.length(); j++) {
                a = b.charAt(j);
                
                if(j % 2 == 0) {
                    answer.append(Character.toUpperCase(a));
                } else {
                    answer.append(Character.toLowerCase(a));
                }
            }
            
            if(i == sSplit.length-1) {
                break;
            }
            
            answer.append(" ");
        }
        
        
        return answer.toString();
    }
}