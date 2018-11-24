class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length-1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    result.add (Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                                
                }
                else if (nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
        
    }
}
//time:O(nlongn) //Arrays.sort
//space: O(1)