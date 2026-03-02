class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[]{};
        
        // 전체 카펫 격자 크기
        int sum = brown + yellow;
        
        // h는 세로. 노란색 격자를 감싸고 있어야 하므로 최소값은 3
        // w는 가로.
        for(int h = 3; h <= sum; h++) {
            if(sum % h == 0) {
                int w = sum / h;
                
                // 노란색을 감싸고 있는 형태이므로 양 끝쪽의 격자는 빼줘야 하므로 h와 w 모두 2를 빼준값의 곱이 노란색과 같아야한다
                if((h - 2) * (w - 2) == yellow) {
                    
                    // 제한사항 3번. 가로 길이는 세로 길이와 같거나 크다
                    answer = new int[]{Math.max(w, h), Math.min(w, h)};
                }
            }
        }
        
        return answer;
    }
}