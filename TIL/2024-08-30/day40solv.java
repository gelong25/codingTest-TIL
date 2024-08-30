//1.입력
//1-1. 각 계단의 비용

//2.논리
//2-1. 시작지점이 0인 경우, 1인 경우 
//2-2. 한 번에 한 계단을 오르는 경우, 두 계단을 오르는 경우 

//3.출력 
//3-1. 계단을 오르는데 드는 최소 비용 

class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int len = cost.length;
        int[] minCost = new int[len + 1];  

        minCost[0] = 0; 
        minCost[1] = 0; 
    
        for (int i = 2; i <= len; i++) {
            minCost[i] = Math.min(minCost[i - 1] + cost[i - 1], minCost[i - 2] + cost[i - 2]);
        }

        return minCost[len];  
    }
}
