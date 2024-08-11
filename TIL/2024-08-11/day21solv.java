import java.util.ArrayList; 
import java.util.List; 

class Solution {
    public List<List<Integer>> generate(int numRows) {

        // 2차원 리스트 생성 
        List<List<Integer>> result = new ArrayList<>();  

        for(int i = 0; i < numRows; i++) {
            // 현재 행을 저장할 리스트 생성 
            List<Integer> row = new ArrayList<>();
            
            for(int j = 0; j <= i; j++) {
                // 각 행의 첫 번째와 마지막 원소는 1로 설정 
                if(j == 0 || j == i) {
                    row.add(1);
                } else { 
                    // 현재 행의 원소는 이전 행의 두 원소의 합 
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }

            }                
            result.add(row);  // 결과 리스트에 행 추가 
        
        }
        return result;
    }
}
