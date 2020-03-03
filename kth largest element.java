class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] temp = new int[k];
        int j=0;
        int min = 0;

        for(int i=0; i < nums.length; i++) {
            if(j < temp.length) {
                temp[j] = nums[i];
                j++;
            } else {
                min = temp[0];
                int index = 0;
                for(int l=1; l < temp.length; l++) {
                    if(temp[l] < min) {
                        min = temp[l];
                        index = l;
                    }
                }

                if(nums[i] > min) {
                    temp[index] = nums[i];
                }
            }
        }
        min = temp[0];
        for(int l=1; l < temp.length; l++) {
            if(temp[l] < min) {
                min = temp[l];
            }
        }
        return min;

    } 
}