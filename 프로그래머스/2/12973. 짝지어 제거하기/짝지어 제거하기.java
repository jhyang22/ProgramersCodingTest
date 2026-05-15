import java.util.*;

class Solution {
    public int solution(String s) {

        // Stack은 LIFO(후입선출) 구조
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            // 만약 stack이 비어있다면 c를 넣는다
            // push() 는 데이터를 추가하는 것
            if(stack.isEmpty()) {
                stack.push(c);
            } else {
                // peek() 은 맨 위에 저장된 객체를 반환하는 것
                // 단, pop() 과 달리 Stack에서 객체를 꺼내지는 않는다!
                // 만약, 비어있을 경우 EmptyStackException이 발생한다
                if(stack.peek() == c) {
                    // pop() 은 맨 위에 저장된 객체를 꺼내는 것
                    // 만약, 비어있을 경우 EmptyStackException이 발생한다
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        
        if(stack.isEmpty()) {
            return 1;
        }
        
        return 0;
    }
}