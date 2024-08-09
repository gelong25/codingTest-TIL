import java.util.Arrays; 
import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        int answer = 0;
        int len = score.length;

        // int 배열을 Integer 배열로 변환 
        Integer scores[] = Arrays.stream(score).boxed().toArray(Integer[]::new);
        // 배열을 내림차순으로 정렬 
        Arrays.sort(scores, Comparator.reverseOrder());

        // 각 m개의 묶음의 가장 작은 값을 선택해 m과 곱해 결과에 더함 
        for(int i = m - 1 ; i < len; i += m) {
            answer += scores[i] * m;
        }
        
        return answer;
    }
}
