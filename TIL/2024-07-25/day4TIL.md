# 오늘의 문제
[프로그래머스] 문자열을 정수로 바꾸기

## 문제 접근 방식
1. 자바에서 제공하는 메서드를 통해 문자열을 정수로 변환한다.
2. 변환된 정수를 출력한다. 


---


## 메서드 비교 : Integer.parseInt(String) VS Interger.valueOf(String) 

1. `Integer.parseInt(String)`
   - 기능: 주어진 문자열을 기본형인 `int`로 변환한다. 
   - 리턴 타입: `int(기본형)`로 반환한다. 
   - 사용 이유: 문자열을 기본형 `int`로 변환할 때 사용한다. 기본형을 사용하기 때문에 메모리 사용이 적고 빠르다. 
   - 사용 예시 
      ```
      String str = "12345";
      int num = Integer.parseInt(str);
2. `Interger.valueOf(String)`
   - 기능: 주어진 문자열을 `Integer` 객체로 변환한다. 
   - 리턴 타입: `Integer(참조형)`로 반환한다. 
   - 사용 이유: 문자열을 `Integer` 객체로 변환할 때 사용한다. 이 메서드는 내부적으로 문자열을 기본형 `int`로 변환한 후, `Integer` 객체로 래핑한다.
   - 사용 예시
      ```
      String str = "98765";
      Integer num = Integer.valueOf(str);
3. 결론

   해당 문제는 기본형 데이터를 객체로 변환해 사용할 필요가 없으므로 더 효율적인 `Integer.parseInt(String)` 메서드를 사용하는 것이 좋다.


---


## 다른 접근 방식 

### 완전 탐색 방식  
   `charAt()` 메서드를 활용해 문자열의 각 문자를 숫자로 변환하고, 이를 통해 최종적으로 정수값을 얻는다. 
     
     
        class Solution {
        public int solution(String s) {
        
           int mark = 1; 
           int indexNum = 0; 
        
           if (s.charAt(0) == '-') {
               mark = -1; 
               indexNum = 1;  
           } else if (s.charAt(0) == '+')   
               indexNum = 1;  
           }
        
           int answer = 0;
        
           for (int i = indexNum; i < s.length(); i++) {
               answer = answer * 10 + (s.charAt(i) - '0'); 
           }
        
           return answer * mark;  
         }
      }

## 각 접근 방식 살펴보기 

1. 내장 메서드 사용 `( parseInt(), valueOf() )`

    코드가 간결하고 사용이 쉽다는 장점이 있지만, 코드를 짤 때 상황에 따라 메서드를 잘 선택할 수 있어야 한다.  

2. 완전 탐색 방식

    각 문자에 대한 제어가 필요한 경우 좋은 방법이다. 하지만 구현이 복잡해질 수 있고 예외 처리가 필요하다는 단점이 있다. 

    




        


  
