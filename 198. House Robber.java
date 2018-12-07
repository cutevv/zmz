class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length;
        //dp[i] = max (nums[i] + dp[i-2], dp[i-1])
        int[] robValue = new int[n];
        robValue[0] = nums[0];
        robValue[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < n; i++){
            robValue[i] = Math.max(nums[i] + robValue[i - 2], robValue[i - 1]);
        }
        return robValue[n - 1];
        
    }
}

//time: O(n)
//space: O(n)