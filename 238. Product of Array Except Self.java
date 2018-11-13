class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        //product from left side
        int left = 1;
        for (int i = 0; i < n; i++){
            res[i] = left;
            left = left * nums[i];
        }
        //mutiply from right side and update with the left * right 
        int right = 1;
        for (int i = n - 1; i >= 0; i--){
            res[i] = right * res[i];
            right = right * nums[i]; 
        }
        return res;
    }
}
//time: O(n)
//space: O(n)
