
# 오늘의 문제
[LeetCode] 1971. Find if Path Exists in Graph

## 문제 설명
`n` 개의 정점을 가진 양방향 그래프가 주어졌을 때, 각 노드의 번호는 `0` 부터 `n-1` 까지 매겨진다. 
그래프의 간선이 담긴 2차원 배열 `edges`와 시작점 `source`, 도착점 `destination`가 주어질 때 `source`에서 `destination` 으로 가는 경로가 존재하는지 여부를 반환하는 문제이다.
- 입출력 예 
  - 입력 예 : `n = 3` `edges = [[0,1],[1,2],[2,0]]` `source = 0` `destination = 2`
  - 출력 예 : `true`
    
## 문제 접근 방식 
1. 그래프를 인접 리스트로 표현한다. 
2. BFS를 사용해 `source`에서 `destination` 까지의 경로를 탐색한다.
3. 경로를 탐색 했을 때 `destination`에 닿으면 `true`를 반환한다.
4. 모든 경로를 탐색했는데도 `destination`에 도달하지 못하면 `false`를 반환한다. 

---

## 인접 리스트 
인접 리스트는 그래프에서 각 노드에 연결된 노드들의 정보를 리스트로 표현하는 방식이다.
각 노드는 리스트로 표현되며, 해당 리스트에는 그 노드와 직접 연결된 다른 노드들의 번호가 저장된다. 
이 방식은 메모리 사용이 효율적이다. 

---

## 인접 행렬 vs 인접 리스트 
- 인접 행렬
    - 그래프를 2차원 배열로 표현하는 방식이다.
    - 두 노드의 간선 존재 여부를 바로 알 수 있다는 장점이 있다.
    - 하지만 모든 관계를 기록하기 때문에 노드의 개수가 많을 수록 불필요한 메모리 낭비가 일어난다. 
- 인접 리스트
    - 그래프를 리스트의 배열로 표현하는 방식이다. 
    - 연결된 간선만 기록하기 때문에 메모리 사용이 효율적이다. 
    - 하지만 두 노드가 연결 돼 있는지 확인하기 때문에 인접 행렬보다 속도가 느리다. 

---

## DFS VS BFS
- DFS는 스택을 사용해 그래프의 깊은 부분 부터 탐색한다.
    - 탐색 시작 노드를 스택에 넣고 방문 처리한다.
    - 스택의 최상단 노드에 방문하지 않은 인접 노드가 있다면, 그 노드를 스택에 넣고 방문 처리한다.
    - 더 이상 방문할 노드가 없을 때까지 이 과정을 반복한다. 
- BFS는 큐를 사용해 그래프의 너비를 먼저 탐색한다. 
    - 탐색 시작 노드를 큐에 넣고 방문 처리한다.
    - 큐에서 노드를 꺼내 해당 노드의 방문하지 않은 모든 인접 노드를 큐에 넣고 방문 처리한다.
    - 더 이상 방문할 노드가 없을 때까지 이 과정을 반복한다. 


   


  
