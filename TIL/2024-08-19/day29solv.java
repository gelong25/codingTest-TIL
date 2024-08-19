import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        // 오름차순 정렬 
        Arrays.sort(nums); 

        // 0 부터 n까지의 범위 설정 
        int left = 0;
        int right = nums.length;
        
        while (left < right) {
            // 중간 인덱스 계산 
            int mid = left + (right - left) / 2;
            // 중간 인덱스 보다 큰 값이 배열에 있을 경우 
            if (nums[mid] > mid) {
                // 왼쪽에 누락된 숫자가 있는 경우 탐색 범위를 왼쪽으로 좁힘
                right = mid;
            } else {
                // 오른쪽에 누락된 숫자가 있는 경우 탐색 범위를 오른쪽으로 좁힘
                left = mid + 1;
            }
        }
        
        return left;
    }
}
