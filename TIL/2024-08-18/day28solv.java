import java.awt.Point;
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<Point> queue = new LinkedList<Point>(); 
        
        int len = priorities.length;
        
        // 큐에 priorities의 인덱스와 요소 저장
        for(int i = 0; i < len; i++) {
            queue.add(new Point(i, priorities[i]));
        }
        
        int answer = 0; 
        
        // 요소를 꺼내 우선순위 확인
        while(!queue.isEmpty()) { 
            Point current = queue.poll(); 
            boolean isHigher = false;        
            
            for(Point p : queue) {
                if(p.y > current.y) {
                    isHigher = true;
                    break;
                }
            }
            
            // 현재 프로세스 보다 우선 순위가 높은 요소가 있으면 현재 요소를 큐에 삽입 
            if(isHigher) {
                queue.add(current);
            } else {
                answer++;
                if(current.x == location) {      
                    return answer; 
                }
            }           
              
        }
        
        return answer; 

    }
}
