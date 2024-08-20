class Solution {
    public int arrangeCoins(int n) {
        
        int left = 0;
        int right = n;
        int mid;
        int current;
        
        // 이진 탐색 수행, k * ((k+1) / 2) <= n을 만족하는 최대 k 찾기 
        while (left <= right) {
            // 중간 값 계산
            mid = left + (right - left) / 2;
            
            // 1 부터 mid 까지의 합 
            current = mid * (mid + 1) / 2;
            
            // 계산된 합이 n과 일치하면 k를 찾은 것이므로 mid 반환 
            if (current == n) {
                return mid; 
            }
            
            // 현재 계산된 합이 n보다 작으면, left 포인터를 mid + 1로 이동
            if (current < n) {
                left = mid + 1; 
            } else {
                // 현재 계산된 합이 n보다 크면, right 포인터를 mid - 1로 이동
                right = mid - 1;
            }
        }
        
        // k * ((k+1) / 2) <= n을 만족하는 가장 큰 정수 k 반환
        return right; 
    }
}
