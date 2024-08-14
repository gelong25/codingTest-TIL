class Solution {
    public int findCenter(int[][] edges) {

        // 첫 번째 간선의 첫 번째 노드와 두 번째 간선의 첫 번째 노드가 같거나 또는 
        // 첫 번째 간선의 두 번째 노드와 두 번째 간선의 첫 번째 노드가 같을 경우 
        if(edges[0][0] == edges[1][0] || edges[0][1] == edges[1][0]) {
            return edges[1][0];  // 공통 노드를 반환 
        } else {                 // 위의 조건에 해당하지 않으면 
            return edges[1][1];  // 두 번째 간선의 두 번째 노드를 반환 
        }
    }
}
