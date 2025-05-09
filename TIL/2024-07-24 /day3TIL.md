# 오늘의 문제
[프로그래머스] 문자열 내 p와 y의 개수


## 문제 접근 방식
1. 문자열 `s`를 대문자로 변환한다.
2. 문자열 `s`의 길이를 저장할 변수를 선언 및 초기화 한다. 
3. `P`와 `Y`의 개수를 셀 변수를 선언 및 초기화 한다.
4. 반복문을 사용해 `P`와 `Y`의 개수를 센 뒤, 각 변수에 저장한다.
5. `P`와 `Y`의 개수를 비교하여 다를 경우, `answer`를 `false`로 반환한다. 


## 문자열을 대문자로 변환하기 
주어진 문자열 `s`는 대소문자가 섞여있다. 따라서 모든 문자를 대문자로 변환하여 비교를 일관되게 한다. 
이 때 `toUpperCase();` 메서드를 사용하면 문자열 전체를 대문자로 변환할 수 있다. 


## 반복문 자세히 알아보기
1. 반복문 초기화 (`int i = 0; i < len; i++`)
   - `i`는 0으로 초기화되어 `i < len`까지 반복된다.
   - 반복이 끝날 때마다 `i`값은 1씩 증가한다.
     
2. 반복문 본문
   
   - 첫 번째 if문 : `if(str.charAt(i) == 'P')`
      - 문자열의 `i`번째 인덱스가 `P`인 경우, `cntP`를 증가시킨다.

   - 두 번째 if문 : `if(str.charAt(i) == 'Y')`
      - 문자열의 `i`번째 인덱스가 `Y`인 경우, `cntY`를 증가시킨다.


## 마지막 조건문의 조건식 설명
조건식에 비교연산자 중 `!=`을 사용한 이유는 문제에서 주어진 변수 `answer`가 이미 `true`로 초기화 되어 있기 때문이다. 
        


  
