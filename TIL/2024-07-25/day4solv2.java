class Solution {
    public String solution(String s) {
        
        // 문자열의 모든 문자를 소문자로 변환 
        String str = s.toLowerCase();
        
        // StringBuilder를 사용하여 새로운 문자열 생성
        StringBuilder sb = new StringBuilder(str);

        // 첫 번째 문자가 알파벳이면 대문자로 변환
        if (sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z') {
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }

        // 반복문을 이용해 공백 뒤에 오는 알파벳을 대문자로 변환
        for (int i = 1; i < sb.length(); i++) {
            // 현재 문자가 공백이고 다음 문자가 존재하는 경우
            if(sb.charAt(i) == ' ' && i + 1 < sb.length()) {
                // 공백 뒤에 오는 문자가 알파벳이면 대문자로 변환
                sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
            }
        }

        return sb.toString();
    }
}
