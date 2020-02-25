class Solution {
    public int findKthLargest(int[] nums, int k) {
        for(int i = 0; i< nums.length -1; i++) {
            for(int j = i+1; j< nums.length; j++) {
                if(nums[j] > nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums[k-1];
    }
}