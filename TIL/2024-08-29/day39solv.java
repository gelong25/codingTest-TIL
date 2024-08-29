import java.util.*;

class Solution { 
    public int findContentChildren(int[] g, int[] s) {
        // 아이들의 욕심(g)과 쿠키의 크기(s)를 오름차순으로 정렬
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;    // 아이들을 가리키는 포인터
        int j = 0;    // 쿠키를 가리키는 포인터

        // 모든 아이들과 모든 쿠키를 탐색할 때까지 반복
        while (i < g.length && j < s.length) {
            // 현재 쿠키 크기가 현재 아이의 욕심을 만족시킬 수 있는 경우
            if (s[j] >= g[i]) {
                // 다음 아이로 넘어감 
                i++;
            }
            // 다음 쿠키로 넘어감 
            j++;
        }

        // 만족시킬 수 있는 아이들의 수 반환
        return i;
    }
}
