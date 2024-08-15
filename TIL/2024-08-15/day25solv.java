class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // 그래프를 인접 리스트 형태로 초기화 
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선을 사용해 그래프 구성 
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // BFS를 위한 큐 초기화 
        Queue<Integer> queue = new LinkedList<>();
        // 방문 여부를 확인하기 위한 배열 초기화 
        boolean[] visited = new boolean[n];

        // 시작 노드를 큐에 추가
        queue.add(source);
        // 시작 노드는 방문으로 표시 
        visited[source] = true;

        // 큐가 비어있지 않은 동안 반복
        while(!queue.isEmpty()) {
            // 큐의 첫 번째 요소를 반환 및 삭제
            int node = queue.poll();

            // destination에 도달한 경우 true 반환 
            if(node == destination) {
                return true;
            }

            // 현재 노드의 이웃 노드를 순회 
            for(int neighbor : graph.get(node)) {
                if(!visited[neighbor]) {   // 아직 방문하지 않은 노드가 있다면
                    queue.add(neighbor);   // 큐에 추가
                    visited[neighbor] = true;  // 해당 노드를 방문했음을 표시 
                }
            }
        }

        // 큐가 빌 때까지 destination에 도착하지 못한 것은 경로가 없다는 것을 의미하므로 false 반환
        return false; 
    }
}
