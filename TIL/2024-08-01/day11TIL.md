# 오늘의 문제
[프로그래머스] 정수 내림차순으로 배치하기 

## 문제 설명
`long` 타입 정수 `n`은 `8000000000` 이하의 자연수이다. `n`의 각 자릿수를 내림차순으로 정렬할 것. 
예를 들어 `n`이 `118372`이라면 `873211`으로 정렬해 반환한다. 

## 문제 접근 방식 
1. `long` 타입 정수 `n`을 문자열로 변환한다.
2. 정렬을 위해 변환된 문자열을 문자열 배열로 변환한다.
3. `Arrays.sort()` 메서드를 사용해 배열을 내림차순으로 정렬한다.
4. 정렬된 배열을 하나의 문자열로 변환한다.
5. 문자열을 `long` 타입 정수로 변환한 뒤 반환한다. 

---

## Arrays.sort()를 사용해 배열 정렬하기 
   - 배열을 내림차순으로 정렬할 땐 `Arrays.sort()` 메서드를 사용한다.
   - 메서드의 기본값은 오름차순이기 때문에 Comparator 구현체를 사용해 내림차순으로 변경해야 한다.
   - `Arrays.sort(arr, Collections.reverseOrder())`
   - `sort`의 두 번째 인자로 `Comparator` 구현체를 주면 내림차순으로 정렬이 가능해진다.

---

## Comparator란 무엇인가  
`Comparator`란 객체를 비교하기 위한 인터페이스이다. 두 객체를 비교해 그 순서를 결정하는 방법을 정의할 수 있다. 
이 인터페이스의 핵심 메서드는 `Compare(T O1, T O2)`이다. 여기서 `T`는 제너릭 타입 매개변수로 어떤 객체 타입이든 올 수 있다. `o1`과 `o2`는 비교할 두 객체를 의미한다.
  - 첫 번째 객체가 두 번째 객체보다 작으면 음수를 반환한다.
  - 첫 번째 객체가 두 번째 객체보다 크면 양수를 반환한다.
  - 두 객체의 값이 같으면 0을 반환한다.  

---

## 배열의 원소를 하나의 문자열로 합치기 
   1. `String s = Arrays.toString(arr);` 을 사용하면 안되는 이유
      - 해당 메서드는 자바의 배열을 문자열로 변환할 때 사용한다.
      - 하지만 이 메서드를 사용했을 때 각 요소는 쉼표로 구분되며, 대괄호에 둘러싸인 형태로 변환된다.
      - 예를들어 `arr`에 `["3", "2", "1"]` 이라는 요소가 들어있을 경우 문자열은 `"[3, 2, 1]"`이 된다.
      - 문자들과 구분 기호로 이루어진 형식은 숫자로 변환할 수 없기 때문에 해당 메서드를 사용하면 컴파일 에러가 발생한다.
   2. `String.join("", arr);`을 사용하는 이유
      - 숫자를 나타내는 문자열을 만들기 위해선 배열의 각 요소를 단순히 결합해야 한다.
      - `String.join()`을 사용하면 배열의 각 요소가 하나의 문자열로 결합하기 때문에 숫자로 변환할 수 있다.           






  
