class Solution {
    public int solution(int[] date1, int[] date2) {

        // for문에서 연도별, 월별, 일별 비교를 해준다
        for(int i = 0; i < date1.length; i++) {
            if(date1[i] < date2[i]) {
                return 1;
            } else  if(date1[i] > date2[i]) {
                return 0;
            }
        }
        
        // 동일 날짜인 경우 for문에서 비교가 안되므로 여기서 return!
        return 0;
    }
}