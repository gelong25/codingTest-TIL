class Solution {
    public int tribonacci(int n) {

        // 주어진 조건 반환 
        if(n == 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
    
        int[] dp = new int[n + 1]; 

        // 초기값 저장 
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        // 메모이제이션을 이용한 계산 
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n]; 

    }
}
출처: https://raccoon-from-attice.tistory.com/entry/99클럽-코테-스터디-41일차-TIL-DP [다락방에서 나온 너구리:티스토리]
