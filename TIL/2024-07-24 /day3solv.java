class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String str = s.toUpperCase(); 
        int len = str.length(); 
        int cntP = 0;
        int cntY = 0; 
        
        for (int i = 0; i < len; i++) {
            if(str.charAt(i) == 'P') {
                cntP++;
            }
            if(str.charAt(i) == 'Y') {
                cntY++;
            }
        }
        
        if (cntP != cntY) {
            answer = false; 
        }
        
        return answer;
    }
}
