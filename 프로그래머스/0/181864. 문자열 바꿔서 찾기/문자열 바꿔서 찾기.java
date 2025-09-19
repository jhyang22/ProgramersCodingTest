class Solution {
    public int solution(String myString, String pat) {
       
        String str = "";
        String[] strArr = myString.split("");
        
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("A")) {
                str += "B";
            } else {
                str += "A";
            }            
        }
        
        if(str.contains(pat)) {
            return 1;
        }
        
        return 0;
    }
}