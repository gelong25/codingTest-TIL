import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {

        // 주어진 정답 배열의 길이를 나타내는 변수
        int len = answers.length;

        // 각 수포자의 답안을 저장할 배열 선언 
        int[] answer1 = new int[len];
        int[] answer2 = new int[len];
        int[] answer3 = new int[len];

        // 각 수포자의 찍기 규칙을 배열로 저장 
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 반복문과 나머지 연산을 이용해 각 수포자의 답안을 저장
        // 규칙 배열을 반복해 답안 배열에 저장 
        for (int i = 0; i < len; i++) {
            answer1[i] = num1[i % num1.length];
            answer2[i] = num2[i % num2.length];
            answer3[i] = num3[i % num3.length];
        }

        // 각 수포자의 점수를 저장할 변수 선언 
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        // 반복문을 사용해 각 수포자의 답안과 정답을 비교 및 점수 계산 
        for (int i = 0; i < len; i++) {
            if (answer1[i] == answers[i]) {
                score1++;
            }
            if (answer2[i] == answers[i]) {
                score2++;
            }
            if (answer3[i] == answers[i]) {
                score3++;
            }
        }

        // 가장 높은 점수를 변수에 저장 
        int max = Math.max(score1, Math.max(score2, score3));

        // 최대 점수를 저장할 리스트 선언 
        ArrayList<Integer> answerList = new ArrayList<>();

        // 점수가 최대 점수일 경우 리스트에 수포자의 번호 저장 (오름차순 정렬)
        if (score1 == max) {
            answerList.add(1);
        }
        if (score2 == max) {
            answerList.add(2);
        }
        if (score3 == max) {
            answerList.add(3);
        }

        // 리스트를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer; 
    }
}
