import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        
        List<int[]>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
        }

        boolean[] visited = new boolean[V];
        int[] minDist = new int[V];
        Arrays.fill(minDist, Integer.MAX_VALUE);
        minDist[0] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{0, 0});
        
        int mstCost = 0;
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int weight = current[1];
            
            if (visited[u]) continue;
            visited[u] = true;
            mstCost += weight;
            
            for (int[] neighbor : graph[u]) {
                int v = neighbor[0];
                int edgeWeight = neighbor[1];
                
                if (!visited[v] && edgeWeight < minDist[v]) {
                    minDist[v] = edgeWeight;
                    pq.add(new int[]{v, edgeWeight});
                }
            }
        }

        System.out.println(mstCost);
    }
}
