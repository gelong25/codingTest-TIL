import java.util.PriorityQueue; 
class KthLargest {

    public  PriorityQueue<Integer> kthLargest;
    public int k; 

    public KthLargest(int k, int[] nums) {

        this.k = k;
        kthLargest = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++) {
            kthLargest.offer(nums[i]); 
            if(kthLargest.size() > k) {
                kthLargest.poll(); 
            }
        }

    }
    
    public int add(int val) {

        if(kthLargest.size() < k) {
            kthLargest.offer(val);
        } else if(val > kthLargest.peek()) {
            kthLargest.remove();
            kthLargest.offer(val);
        }
        return kthLargest.peek(); 
    }
}

