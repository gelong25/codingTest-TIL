// 완전 탐색을 통한 풀이 
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = " ";
        int p_len = participant.length;
        int c_len = completion.length;

        for (int i = 0; i < c_len; i++) {
            for (int j = 0; j < p_len; j++) {
                if (completion[i].equals(participant[j])) {
                    participant[j] = " "; 
                    break;  
                }
            }
        }

        for (int i = 0; i < p_len; i++) {
            if (!participant[i].equals(" ")) {
                answer = participant[i];
                break;
            }
        }

        return answer;
    }
}

// 해시맵을 통한 풀이 
