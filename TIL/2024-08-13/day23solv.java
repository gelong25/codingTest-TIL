class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);   // 배열 nums 오름차순 정렬 
        int sum = 0;         // 결과를 저장할 변수 sum 선언 및 초기화 

        // 두 요소씩 건너뛰며 작은 값을 sum에 더함 
        for (int i = 0; i < nums.length; i += 2) {   
            sum += nums[i]; 
        }
        
        return sum; 
    }
}
