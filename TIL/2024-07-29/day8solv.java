import java.util.Stack; 

class Solution {
    boolean solution(String s) {
        
        boolean answer = true; // 정답으로 반환할 변수 answer, 초기값은 true로 설정 

        Stack<Character> stack = new Stack<>();   // 문자 저장을 위한 스택 선언 

        // 주어진 문자열을 순회하며 문자를 검사하는 반복문 
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') {                    // 열린 괄호를 만나 스택에 추가 
                stack.push(ch);        
            } 
            
            else if(ch == ')') {              // 닫힌 괄호를 만난 경우 
                if(stack.isEmpty()) {         // 스택이 비어있으면 유효하지 않으므로 false 반환 
                    return false; 
            } 
            else {                            // 스택이 비어있지 않은 경우, 스택의 데이터(열린괄) 제거 
                stack.pop(); 
            }
        }
    }
        // 유효성 검사 
        if (!stack.isEmpty()) {              // 스택이 비어있지 않은 경우 (열린괄호와 닫힌 괄호의 개수가 다른 경우) 유효하지 않으므로 
            answer = false;                  // false 반환 
        }
    

        return answer;
    }
}




// 첫 시도 
/*
import java.util.Stack; 

class Solution {
    boolean solution(String s) {
        
        // 정답으로 반환할 변수 answer, 초기값은 true로 설정 
        boolean answer = true;

        // 스택을 사용하여 문자열의 괄호를 저장
        Stack<Character> stack = new Stack<>();
        
        // 주어진 문자열을 한 문자씩 스택에 추가 
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            stack.push(ch);
        }

        // 닫힌 괄호와 열린 괄호의 개수를 세기 위한 변수 초기화
        int cnt_close = 0; 
        int cnt_open = 0; 
        
        // 스택이 비어있지 않은 동안 루프 실행
        while(!stack.isEmpty()) {
            // 스택에서 문자를 하나씩 제거
            char c = stack.pop();
            
            // 제거된 문자가 닫힌 괄호인 경우 cnt_close 증가
            if(c == ')' ) {
                cnt_close++;
            }
            // 제거된 문자가 열린 괄호인 경우
            else if (c == '(' ) {
                if(cnt_close > 0) {
                    // 만약 닫힌 괄호가 이전에 있었다면 cnt_close 감소
                    cnt_close--;
                } else {
                    // 닫힌 괄호가 없다면 cnt_open 증가
                    cnt_open++; 
                }
            }
        }
        
        // 열린 괄호나 닫힌 괄호의 개수가 남아있는 경우 정답을 false로 설정
        if(cnt_open != 0 || cnt_close != 0) {
            answer = false; 
        }
        
        return answer;
    }
}

*/
