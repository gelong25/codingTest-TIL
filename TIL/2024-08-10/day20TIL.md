
# 오늘의 문제
[프로그래머스] 체육복

## 문제 설명
체육복 도난 사건이 발생하여 체육복이 없는 학생은 수업을 들을 수 없다. 
여분의 체육복을 가진 학생이 있지만 자신의 바로 앞과 뒷 번호 학생에게만 빌려줄 수 있다.
이때 체육 수업을 들을 수 있는 최대 학생의 수를 구하는 문제이다. 
단, 여벌을 가진 학생이 도난당한 경우 다른 학생에게 체육복을 빌려 줄 수 없다. 
- 입력 
  - 전체 학생수 : `n`
  - 체육복을 도난당한 학생들의 번호가 담긴 배열 : `lost`
  - 여분의 체육복을 가진 학생들의 번호가 담긴 배열 : `reserve` 
- 입출력 예 
  - 입력 예 : `5, [2,4] [1,3,5]`
  - 출력 예 : `5`

## 문제 접근 방식 
1. `lost`와 `reserve` 배열의 요소를 각각 해쉬셋에 저장한다.
2. 여벌의 체육복을 가진 학생이 도난 당한 경우를 대비해 두 해쉬셋의 교집합을 구해 제거한다.
3. `lostSet`을 순회하며 앞 번호나 뒷 번호 학생이 여분의 체육복을 갖고 있는지 검사한다.
4. 만약 여분의 체육복을 갖고 있는 경우 `lostSet`과 `reserveSet`에서 학생 번호를 제거한다.
5. 전체 학생 수에서 체육복을 빌리지 못한 학생 수를 뺀 결과를 반환한다. 

---

## 해쉬셋(HashSet) 
해쉬셋은 중복을 허용하지 않으며 빠른 검색, 추가, 삭제가 가능한 자료구조이다.
해당 문제에서 학생들의 번호를 관리하고 빠르게 탐색 및 제거 작업을 수행하기 위해 사용했다.
특히 교집합 처리에 유리해 `lostSet`과 `reserveSet`의 중복값을 제거하기 좋았다. 

---

## retainAll() 메서드 사용하기 
`retainAll()` 메서드는 해쉬셋의 요소들을 비교해 동일한 요소는 해쉬셋에 남기고 그 외의 요소를 제거하는 메서드이다. 
이번 문제 풀이에선 두 집합의 교집합을 구해 각 집합에서 중복된 값을 제거하는데 사용하였다.
먼저 `intersection` 에 `lostSet`의 요소를 복사한뒤 `reserveSet`과 중복된 값만 남기고 나머지를 제거한다.
`removeAll()` 메서드를 사용해 `lostSet`과 `reserveSet`에서 중복된 값을 제거한다. 
```java
Set<Integer> intersection = new HashSet<>(lostSet);
intersection.retainAll(reserveSet);
        
lostSet.removeAll(intersection);
reserveSet.removeAll(intersection);
```

---

## 코드 개선
체육복을 잃어버린 학생들의 앞이나 뒷번호를 확인해 빌릴 수 있는지 검사하는 부분에서
`lostSet`의 복사본을 이용하던 방식에서 이를 제거하고, `else`문을 추가하여 빌릴 수 없는 경우 전체 학생 수를 하나 감소하도록 수정하였다.
이로 인해 불필요한 복사본 생성을 줄이고 보다 코드를 간결하게 만들 수 있었다. 
```java
// 수정 전
for(int l : new HashSet<>(lostSet)) {
            if(reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
                lostSet.remove(l);
            } else if(reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
                lostSet.remove(l);
            }
        }
        
        answer = n - lostSet.size(); 
        
        return answer;

// 수정 후 
for (int l : lostSet) {
            if (reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1);
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1);
            } else {
                n--; 
            }
        }
        
        return n; 
```

---

## 다른 풀이
아래는 배열의 인덱스를 활용한 풀이이다. 
`people` 배열에서 값이 `1`이면 여분이 있는 학생, `-1`이면 체육복이 없는 학생으로 구분하였다. 
반복문을 순회하여 앞이나 뒷 번호 학생에게서 체육복을 빌릴 수 있는지 여부를 검사하고 
불가능한 경우, 학생 수를 감소시켜 결과값을 반환한다. 
```java
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    }
}
```
   


  
