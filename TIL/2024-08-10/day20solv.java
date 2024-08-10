import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 체육복을 잃어버린 학생들의 번호를 담을 해쉬셋 선언
        Set<Integer> lostSet = new HashSet<>();
        // 체육복 여유분이 있는 학생들의 번호를 담을 해쉬셋 선언
        Set<Integer> reserveSet = new HashSet<>();

        // for-each문으로 배열의 요소를 해쉬셋에 추가
        for(int l : lost) {
            lostSet.add(l);
        }
        
        for(int r : reserve) {
            reserveSet.add(r);
        }

        // 두 집합의 교집합을 제거하기 위해 lostSet의 요소를 intersection에 복사
        Set<Integer> intersection = new HashSet<>(lostSet);
        // lostSet과 reserveSet의 중복된 요소만 남기고 나머지 제거
        intersection.retainAll(reserveSet);

        // 교집합에 해당하는 학생 번호 제거
        lostSet.removeAll(intersection);
        reserveSet.removeAll(intersection);

        // 체육복을 잃어버린 학생들의 앞이나 뒷번호 학생에게 빌릴 수 있는지 검사
        for(int l : new HashSet<>(lostSet)) {       // lostSet의 복사본을 사용해 순회
            if(reserveSet.contains(l - 1)) {        // 앞 번호 학생에게 빌릴 수 있는지 확인
                reserveSet.remove(l - 1);           // 빌려준 학생의 번호를 reserveSet에서 제거
                lostSet.remove(l);                  // 빌린 학생의 번호를 lostSet에서 제거 
            } else if(reserveSet.contains(l + 1)) { // 뒷 번호 학생에게 빌릴 수 있는지 확인
                reserveSet.remove(l + 1);           // 빌려준 학생의 번호를 reserveSet에서 제거
                lostSet.remove(l);                  // 빌린 학생의 번호를 lostSet에서 제거 
            }
        }

        // 체육복을 빌리지 못한 학생 수를 전체 학생 수에서 뺀 결과 저장 
        answer = n - lostSet.size(); 
        
        return answer;
    }
}
