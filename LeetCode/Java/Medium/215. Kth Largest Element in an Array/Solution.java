class Solution {
    public int findKthLargest(int[] nums, int k) {
        
         PriorityQueue<Integer> pq = new 
            PriorityQueue<>( );
        for(int i = 0 ; i < nums.length; i++){
            pq.offer(nums[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // while(k > 1){
        //     pq.poll();
        //     k--;
        // }
        return pq.peek();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna