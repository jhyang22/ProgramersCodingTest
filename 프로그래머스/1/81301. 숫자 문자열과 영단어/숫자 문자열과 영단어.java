class Solution {
    public int solution(String s) {
        
        //숫자에 대응되는 영단어 배열
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < str.length; i++) {
            // str[i]에 해당한다면 i로 바꾼다
            // String.valueOf()를 해주는 이유는 i가 int고 s는 문자열이기 때문
            s = s.replace(str[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
}