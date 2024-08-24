import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] map;
    static boolean[][] visited;
    static int H, W;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  
        
        for (int t = 0; t < T; t++) {
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());  
            W = Integer.parseInt(st.nextToken()); 

            map = new char[H][W];
            visited = new boolean[H][W];

 
            for (int i = 0; i < H; i++) {
                String line = br.readLine();
                for (int j = 0; j < W; j++) {
                    map[i][j] = line.charAt(j);
                }
            }

            int sheepCnt = 0; 

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] == '#' && !visited[i][j]) {
                        dfs(i, j);  
                        sheepCnt++;
                    }
                }
            }

            System.out.println(sheepCnt);  
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;  

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < H && ny < W) {
                if (map[nx][ny] == '#' && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
