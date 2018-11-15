class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3){
            return nums.length;
        }
        int start = 2;
        for (int i = 2 ; i < nums.length; i++){
            if (nums[i] > nums[start-2]){
                nums[start++] = nums[i];
            }
        }
        return start;   
    }
}

//time: O(n)
//space: O(1)