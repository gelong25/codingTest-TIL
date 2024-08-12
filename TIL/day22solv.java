import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        // 결과를 저장할 row 리스트 생성
        List<Integer> row = new ArrayList<>(); 
        
        // 행의 첫 번째 요소로 1 저장 
        row.add(1);

        for(int i = 1; i <= rowIndex; i++) {
            
            // 현재 행의 이전 값을 기반으로 새로운 행을 계산하기 위해 row 리스트의 복사본인 preRow 리스트 생성
            List<Integer> preRow = new ArrayList<>(row);

            // 현재 행의 가운데 값들을 계산
            for(int j = 1; j < i; j++) {
                // preRow의 j번째 값을 이전 행의 두 값을 더한 값으로 설정
                preRow.set(j, row.get(j - 1) + row.get(j));
            }

            // 행의 마지막 요소로 1 저장 
            preRow.add(1);

            // 계산된 행을 현재 행에 복사
            row = preRow;
        }
        return row; 
    }
}
