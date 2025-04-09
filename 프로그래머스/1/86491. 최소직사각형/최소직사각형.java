class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int w = 0;
        int h = 0;
        
        int[][] a = new int[sizes.length][2];
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                a[i][0] = sizes[i][1];
                a[i][1] = sizes[i][0];
            } else {
                a[i][0] = sizes[i][0];
                a[i][1] = sizes[i][1];
            }
        }
        
        for(int i = 0; i < a.length; i++) {
            w = Math.max(a[i][0], w);
            h = Math.max(a[i][1], h);
        }
        
        answer = w * h;
        
        return answer;
    }
}

// 최소직사각형을 구하려면 가로와 세로를 정렬해야한다
// 가로를 가장 긴 거로 정렬할 경우
// MAX 가로길이, MAX 세로길이를 구한다
// 두개 곱하기