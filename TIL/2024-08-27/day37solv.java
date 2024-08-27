//1. 입력 
//1-1 테스트 케이스의 개수 T 입력 
//1-2 T 줄에 걸쳐 각 줄에 n과 m 입력 

//2. 논리
//2-1 범위 : 0 < a < b < n 
//2-2 다음 식이 정수가 되는 경우 cnt 증가  
//2-2-1 (a^2 + b^2 + m) / ab 조건 체크 

//3. 출력
//3-1. 각 테스트 케이스에 대해 조건을 만족하는 (a,b) 쌍의 개수 출력 

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    static int T, n, m;

    public static int countPairs() {
        int cnt = 0; 

        // a와 b의 가능한 모든 쌍 탐색
        for(int a = 1; a < n; a++) {
            for(int b = a + 1; b < n; b++) {
                // 분자 계산 (a^2 + b^2 + m)
                int numerator = (int)Math.pow(a, 2) + (int)Math.pow(b, 2) + m;
                // 분모 계산 
                int denominator = a * b; 
                // 분자 분모로 나누어 떨어지는지 확인 
                if(numerator % denominator == 0) {
                    cnt++; 
                }
                
            }
        }
        
        return cnt;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스의 개수 입력 받기 
        T = Integer.parseInt(br.readLine());

        // 각 테스트 케이스 처리 
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            
            //countPairs() 메서드 사용해 조건을 만족하는 쌍의 개수 계산 
            int answer = countPairs();
            System.out.println(answer);
        }

    }
}
