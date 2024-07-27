import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        int len = nums.length;
        int maxSelection = len / 2;
    
        HashSet<Integer> deduped = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            deduped.add(num);
        }
        
        int maxUnique = deduped.size();
        int result;
        
        if (maxSelection < maxUnique) {
            result = maxSelection;
        } else {
            result = maxUnique;
        }
        
        return result;
    }
}
