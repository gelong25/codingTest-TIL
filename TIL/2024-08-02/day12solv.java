import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";

        // 문자열 s를 문자 배열로 변환 
        String[] arr = s.split("");
        // 아스키코드 값을 저장할 Integer 배열 생성
        Integer[] answerArr = new Integer[arr.length];

        // 반복문을 통해 각 문자를 아스키코드 값으로 변환하여 배열에 저장 
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i].charAt(0);
            answerArr[i] = num;
        }

        // 아스키코드 값을 내림차순으로 정렬 
        Arrays.sort(answerArr, Collections.reverseOrder());

        // 정렬된 아스키코드 값을 문자로 변환하여 저장할 char 배열 생성 
        char[] charArr = new char[answerArr.length];

        // 아스키 코드 값을 문자로 변환하여 char 배열에 저장  
        for(int i = 0; i < answerArr.length; i++) {
            charArr[i] = (char) answerArr[i].intValue();
        }
      
        // char 배열을 문자열로 변환   
        // answer = String.join("", charArr);
        answer = new String(charArr);
        
        return answer;
    }
}
