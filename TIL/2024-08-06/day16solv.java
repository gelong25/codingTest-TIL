// 내 풀이 
class Solution {
    public int solution(int[][] sizes) {
        
        int answer = 0;

        // 가로와 세로의 최대값을 저장할 변수 
        int maxW = 0;
        int maxH = 0;

        // sizes 배열의 길이
        int len = sizes.length; 

        // 가로가 세로보다 작은 경우 둘을 교환
        for(int i = 0; i < len; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp; 
            }
        }

        // 가로와 세로의 최대값 구하기 
        for(int i = 0; i < len; i++) {
            if(sizes[i][0] > maxW) {   
                maxW = sizes[i][0];
            }
            if(sizes[i][1] > maxH) {   
                maxH = sizes[i][1];
            }
        }

        // 가로와 세로의 최대값을 곱한 결과 저장 
        answer = maxW * maxH; 
        
        return answer;
    }
}


// 다른 풀이 
class Solution {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            // 가로와 세로 크기를 비교해 큰 값을 선택한 뒤 length에 가장 큰 값을 저장 
            length = Math.max(length, Math.max(card[0], card[1]));  
            // 가로와 세로 크기를 비교해 작은 값을 선택한 뒤 height에 가장 큰 값을 저장 
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
