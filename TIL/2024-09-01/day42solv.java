class Solution {
    public int maxProfit(int[] prices) {
        // 최대 이익 변수 선언 및 초기화 
        int profit = 0;
        // 매입 금액 변수 선언 및 초기화 
        int buy = prices[0];
        
        // prices 배열 순회 
        for(int sell : prices) {
            // 판매 금액이 매입 금액보다 높을 경우 
            if(sell > buy) {
                // 현재 이익과 과거 이익 중 더 큰 값을 이익 변수에 저장 
                profit = Math.max(profit, sell - buy);
            } else {             // 판매 금액이 매입 금액 보다 낮을 경우 
                buy = sell;      // 새로운 매입 금액으로 갱신 
            }
        }
        return profit;
    }
}
