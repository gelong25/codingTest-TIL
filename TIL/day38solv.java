import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        boolean isOdd = false; 

        // 해시맵에 각 문자와 그에 해당하는 빈도수를 저장
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        // 해시맵을 순회하며 빈도수가 홀수인지 짝수인지 판단 
        for(int cnt : map.values()) {
              // 빈도수가 짝수인 경우 빈도수를 len에 더함 
              if(cnt % 2 == 0) {
                len += cnt;
            } // 빈도수가 홀수인 경우 len에 (빈도수 - 1)을 더함 
              else {
                isOdd = true;
                len += cnt - 1; 
            }
        }
        // 빈도수가 홀수인 경우가 존재하면 len에 1을 더함 
        if(isOdd) {
            len += 1;
        }

    return len;     
    }

}
