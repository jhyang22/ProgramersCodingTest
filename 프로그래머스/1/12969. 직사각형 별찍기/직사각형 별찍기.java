import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String str = "*";
        
        String answer = "";
        
        for(int i = 1; i <= b; i++) {
            if (i == b) {
                answer += str.repeat(a);
                break;
            } 
            answer += str.repeat(a) + "\n";
        }
        
        System.out.println(answer);
    }
}