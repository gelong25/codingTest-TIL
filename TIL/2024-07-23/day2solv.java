class Solution {
    public double solution(int[] arr) {
        
        int len = arr.length; 
        double sum = 0; 
        
        for(int i = 0; i < len; i++) {
            sum += arr[i];
        }
        
        double answer = 0; 
        answer = sum / len; 
        return answer;
    }
}
