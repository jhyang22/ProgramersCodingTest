class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int maxWallet = 0;
        int minWallet = 0;
        int maxBill = 0;
        int minBill = 0;
        
        if(bill[0] > bill[1]) {
            maxBill = bill[0];
            minBill = bill[1];
        } else {
            maxBill = bill[1];
            minBill = bill[0];
        }
        
        if(wallet[0] > wallet[1]) {
            maxWallet = wallet[0];
            minWallet = wallet[1];
        } else {            
            maxWallet = wallet[1];
            minWallet = wallet[0];
        }
        
        while(maxBill > maxWallet || minBill > minWallet) {
            maxBill /= 2;
            
            if(maxBill < minBill) {
                int temp = maxBill;
                maxBill = minBill;
                minBill = temp;
            }
            
            answer++;
        }
        
        return answer;
    }
}