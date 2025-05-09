
# 오늘의 문제
[LeetCode] 268. Missing Number

## 문제 설명
`[0,n]` 범위의 배열 `nums`가 주어질 때 이 배열은 해당 범위의 서로 다른 정수를 갖는다. 이 중 빠진 값을 찾아 반환하는 문제이다. 
- 입출력 예 
  - 입력 예 : `nums = [3,0,1]`
  - 출력 예 : `2`

## 문제 접근 방식 
1. 배열을 오름차순 정렬한다.
2. 배열의 범위를 변수로 지정한다. 배열의 첫 번째 인덱스를 가리키는 변수 `left`, 배열의 길이를 의미하는 변수로 `right`를 지정한다. 
3. 중간 인덱스를 계산하고 해당 인덱스에 있는 값이 인덱스 보다 큰지 작은지 검사한다.
4. 중간 인덱스에 있는 값이 인덱스보다 크면 누락된 숫자는 중간을 기준으로 배열의 왼쪽에 있고 그렇지 않으면 오른쪽에 있다.
5. 위 과정을 `left`가 `right`와 만날 때까지 반복한다.
6. `left`가 누락된 숫자이므로 이를 반환한다. 

---

## 이분 탐색 알아보기 
이분 탐색은 정렬된 배열에서 특정 값을 찾기 위한 알고리즘으로 시간 복잡도는 `O(log n)`이다. 
배열의 중간 값을 기준으로 탐색 범위를 절반으로 줄여 나가는 방식으로 동작한다. 
1. 초기 설정 : 배열의 첫 번째 요소를 가리키는 `left`와 마지막 요소를 가리키는 `right`를 선언한다.
2. 중간 인덱스 계산 : `left`와 `right`의 중간 위치를 계산해 `mid` 인덱스 값을 얻는다.
3. 비교 및 탐색 범위 조정 : 중간 인덱스의 값과 찾고자 하는 값을 비교한다.
   - 중간 인덱스의 값이 찾고자 하는 값보다 크면, 탐색 범위를 왼쪽 절반으로 줄인다.
   - 중간 인덱스의 값이 찾고자 하는 값보다 작으면, 탐색 범위를 오른쪽 절반으로 줄인다.






  
