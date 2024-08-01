import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {

        // long 타입 정수 n을 문자열로 변환하기 
        String str = Long.toString(n);

        // 문자열을 한 글자씩 분리하여 문자열 배열로 변환하기 
        String[] arr = str.split("");

        // 배열을 내림차순 정렬하기 
        Arrays.sort(arr, Collections.reverseOrder());

        // 정렬된 배열의 원소들을 하나의 문자열로 합치기 
        //String s = Arrays.toString(arr);
        String s = String.join("", arr);

        // 문자열을 long 타입 정수로 변환하기 
        long answer = Long.parseLong(s);  
    
        // 결과값 반환 
        return answer;
    }
}
