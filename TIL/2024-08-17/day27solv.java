class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        // 공원의 가로, 세로 길이  
        int h = park.length;
        int w = park[0].length(); 

        // 로봇 강아지의 시작 위치 
        int x = 0;
        int y = 0;

        // 방향 배열 : 북 남 서 동
        int dx[] = {-1,1,0,0};
        int dy[] = {0,0,-1,1};

        // 시작 위치 구하기 
        outerLoop: 
        for(int i = 0; i < h; i ++) {
            for(int j = 0; j < w; j++) {
                if(park[i].charAt(j) == 'S') {
                    x = i;
                    y = j; 
                    break outerLoop; // 조건 부합 시 이중 루프 탈출 
                }
            }
        }

        // 주어진 경로 탐색하기 
        for(String route : routes) {
            
            char moveType = route.charAt(0);    // 방향
            int move = route.charAt(2) - '0';   // 이동 거리 

            boolean block = false; // 장애물 확인 
            int direction = 0; 

            switch(moveType) {
                case 'N' : 
                    direction = 0;
                    break; 
                case 'S' :
                    direction = 1;
                    break;
                case 'W' : 
                    direction = 2;
                    break;
                case 'E' :
                    direction = 3;
                    break;  
            }

            // 로봇 강아지 현재 위치 
            int nx = x;  
            int ny = y; 

            // 공원을 벗어나거나 장애물을 만난게 아니라면 위치 업데이트 
            for(int i = 0; i < move; i++) {
                
                nx += dx[direction];
                ny += dy[direction];

                if(nx < 0 || nx >= h || ny < 0 || ny >= w || park[nx].charAt(ny) == 'X') {
                    block = true; 
                    break; 
                }
            }

        }
        
        int[] answer = {x, y};
        return answer;
    }
}
