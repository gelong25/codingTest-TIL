
# 오늘의 문제
[LeetCode] 1791. Find Center of Star Graph

## 문제 설명
주어진 2차원 배열 `edges`는 `Star Graph`의 간선들을 나타낸다. `Star Graph`는 하나의 중심 노드와 이 중심 노드에 연결된 여러 개의 주변 노드로 구성된다. 
모든 주변 노드는 하나의 중심 노드와 연결되는데 이 때 중심 노드를 찾아 반환하는 문제이다. 
- 입출력 예 
  - 입력 예 : `edges = [[1,2],[2,3],[4,2]]`
  - 출력 예 : `2`

## 문제 접근 방식 
1. 2차원 배열 `edges`의 첫 번째 간선과 두 번째 간선의 노드들을 비교한다. 
2. 두 간선에서 공통으로 등장하는 노드가 중심 노드이므로, 해당 노드를 반환한다.




  
