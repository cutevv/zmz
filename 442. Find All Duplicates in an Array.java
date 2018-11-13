class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0){
            return res;
        }
        for (int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                res.add(Math.abs(nums[i]));
            }
            nums[index] = -nums[index];
        }
        return res;
    }
}
//time: O(n)
//space: O(1)
