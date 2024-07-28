import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] solution(int []arr) {

        // 큐 생성 
        Queue<Integer> queue = new LinkedList<Integer>();

        // 큐에 arr 배열의 원소 추가 
        /* for(int i = 0; i < arr.length; i++) {
             queue.add(arr[i]);
        } */
        // for문 for-each문으로 리팩토링 
        for(int num : arr) {
          queue.add(num);
        }

        // 중복 제거를 위한 result 리스트 선언 
        List<Integer> result = new ArrayList<>();

        // 큐의 첫 번째 요소를 꺼내 변수에 저장 
        int prev = queue.poll();
        // 첫 번째 요소를 result 리스트에 추가  
        result.add(prev);

        // 큐의 요소를 하나씩 비교하여 처리  
        while(!queue.isEmpty()) {       // 큐가 비어 있지 않은 동안 반복 
            int current = queue.poll(); // 큐의 첫 번째 요소를 꺼내 current에 저장
            if(current != prev) {       // 현재 요소와 이전 요소가 같지 않으면
                result.add(current);    // result 리스트에 현재 요소 추가 
                prev = current;         // 이전 요소를 현재 요소로 업데이트 
            }
        }

        // result 리스트를 배열로 변환
        int[] answer = new int[result.size()];     // result 리스트 크기의 배열 생성
        for(int i = 0; i < result.size(); i++) {   // 리스트의 요소를 배열에 복사 
            answer[i] = result.get(i);
        }

        return answer;
    }
}
