#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int left, int right) {
    int answer = 0;
    
    for(int i = left; i < right+1; i++) {
        int a = 0;
        for(int n = 1; n < i+1; n++) {
            if(i % n == 0) { 
                a++;
            }
        }
        
        if(a % 2 == 0) {
            answer += i;
        } else {
            answer -= i;
        }
    }
    
    return answer;
}

// 1. 약수를 어떻게 구할까..
// 2. 일단 임의의 정수 n으로 나눴을 때 나머지가 0이면 약수
// 3. 그 n이 짝수면 더하고 홀수면 빼기