import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//import java.util.StringTokenizer;

public class Main
{
    private static int M, N, k;
    private static int startX, startY, endX, endY; 
    private static int[][] map;

    // 모눈종이에 직사각형 좌표 채우기 
    public static void square(int x1, int y1, int x2, int y2) {
        for(int i = y1; i < y2; i++) {
            for(int j = x1; j < x2; j++) {
                map[i][j] = 1;
            }
        }
    }
  
    public static int bfs(int m, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{m, n});
        map[m][n] = 1; //방문 처리 및 직사각형 표시 

        int blank = 1; 

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 네 방향 탐색
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 모눈종이 범위 내에 있고 방문 전인 경우(0)
                if(nx >= 0 && nx < M && ny >= 0 && ny < N && map[nx][ny] == 0) {
                    // 큐에 추가 
                    queue.add(new int[]{nx, ny});
                    // 방문 처리(1) 
                    map[nx][ny] = 1;
                    // 빈 공간의 넓이 증가 
                    blank++;
                }
            }
        }
        return blank; 
    }
    
    public static void main(String[] args) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /*
        첫째 줄에 M과 N, 그리고 K가 빈칸을 사이에 두고 차례로 주어진다. 
        M, N, K는 모두 100 이하의 자연수이다.
        */
        // 첫 번째 줄 입력 처리 
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        // M x N 2차원 배열 생성 
        map = new int[M][N];

        /*
        둘째 줄부터 K개의 줄에는 한 줄에 하나씩 
        직사각형의 왼쪽 아래 꼭짓점의 x, y좌표값과 
        오른쪽 위 꼭짓점의 x, y좌표값이 빈칸을 사이에 두고 차례로 주어진다.
        */
        // 두번째 줄 부터 k개의 줄 입력 처리 
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());

            // 직사각형을 map에 채우기 
            square(startX, startY, endX, endY);
        }

        List<Integer> answer = new ArrayList<>();

        //map을 순회하며 BFS로 빈 영역 탐색
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == 0) {
                    answer.add(bfs(i, j));
                }
            }
        }

        Collections.sort(answer);

        System.out.println(answer.size());
        for(int answers : answer) {
            System.out.print(answers + " ");
        }

        
    }
}
