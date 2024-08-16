class Solution {
    public int[] solution(String[] wallpaper) {

        // 가장 왼쪽 위의 좌표 초기화 
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        
        // 가장 오른쪽 아래의 좌표 초기화 
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        // wallpaper 배열을 순회하면서 # 문자 위치 찾기 
        for(int i=0; i< wallpaper.length;i++ ){
          // 각 행의 모든 열 순회 
          for(int j=0; j<wallpaper[i].length();j++){
              
              // 현재 위치에 # 문자가 있으면   
              if(wallpaper[i].charAt(j)=='#'){
                    
                    // 왼쪽 위의 x, y 좌표 갱신해 최솟값 유지 
                    lux = Math.min(lux,i);
                    luy = Math.min(luy,j);
                    
                    // 오른쪽 아래의 x, y 좌표를 갱신해 최댓값 유지 
                    rdx = Math.max(rdx,i);
                    rdy = Math.max(rdy,j);
                }
            }
        }   
        
        int[] answer = {lux,luy,rdx+1,rdy+1};
        
        return answer; 
    }
}
