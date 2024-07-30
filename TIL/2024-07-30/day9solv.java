import java.util.PriorityQueue;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> score[b] - score[a]);

        int n = score.length;
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            maxHeap.add(i); 
        }

        int rank = 1;
        while(!maxHeap.isEmpty()) {
            int index = maxHeap.poll();
            if(rank == 1) {
                answer[index] = "Gold Medal";
            } else if(rank == 2) {
                answer[index] = "Silver Medal";
            } else if(rank == 3) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(rank);
            }
            rank++;
        }

        return answer;
    }
}
