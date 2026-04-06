class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int num = 0;
        
        for(int i = 0; i < num_list.length / n; i++) {
            int[] temp = new int[n];
            
            for(int j = 0; j < n; j++) {
                temp[j] = num_list[num];
                num++;
            }
            
            answer[i] = temp;
        }
        
        return answer;
    }
}