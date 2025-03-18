class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split("");
        
        if(sArr.length % 2 == 0) {
            int a = sArr.length / 2;
            int b = (sArr.length / 2) - 1;
            answer = sArr[b] + sArr[a];
        } else {
            int a = sArr.length / 2;
            answer = sArr[a];
        }
        
        return answer;
    }
}

// 1. 배열로 만든다
// 2. 배열의 길이가 홀수라면 가운데 인덱스 호출
// 3. 배열의 길이가 짝수라면 가운데 두글자 호출