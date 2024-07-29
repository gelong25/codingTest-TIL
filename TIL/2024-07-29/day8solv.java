import java.util.Stack; 

class Solution {
    boolean solution(String s) {
        
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') {
                stack.push(ch);
            } 
            
            else if(ch == ')') {
                if(stack.isEmpty()) {
                    return false; 
            } 
            else {
                stack.pop(); 
            }
        }
    }
        if (!stack.isEmpty()) {
            answer = false; 
        }
    

        return answer;
    }
}




// 첫 시도 
/*
import java.util.Stack; 

class Solution {
    boolean solution(String s) {
        
        // 초기 정답을 true로 설정
        boolean answer = true;

        // 스택을 사용하여 문자열의 괄호를 저장
        Stack<Character> stack = new Stack<>();
        
        // 주어진 문자열을 한 문자씩 스택에 푸시
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            stack.push(ch);
        }

        // 닫는 괄호와 여는 괄호의 개수를 세기 위한 변수 초기화
        int cnt_close = 0; 
        int cnt_open = 0; 
        
        // 스택이 비어있지 않은 동안 루프 실행
        while(!stack.isEmpty()) {
            // 스택에서 문자를 하나씩 팝
            char c = stack.pop();
            
            // 팝된 문자가 닫는 괄호인 경우 cnt_close 증가
            if(c == ')' ) {
                cnt_close++;
            }
            // 팝된 문자가 여는 괄호인 경우
            else if (c == '(' ) {
                if(cnt_close > 0) {
                    // 만약 닫는 괄호가 이전에 있었다면 cnt_close 감소
                    cnt_close--;
                } else {
                    // 닫는 괄호가 없다면 cnt_open 증가
                    cnt_open++; 
                }
            }
        }
        
        // 여는 괄호나 닫는 괄호의 개수가 남아있는 경우 정답을 false로 설정
        if(cnt_open != 0 || cnt_close != 0) {
            answer = false; 
        }
        
        return answer;
    }
}

*/
