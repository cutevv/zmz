class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new  ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
            return result;
        }
        List<Integer> curr = new ArrayList<Integer>();
        findSets(nums, 0, result, curr);
        return result;
    }
    private void findSets(int[] nums, int index, List<List<Integer>> result, List<Integer> curr){
        result.add(new ArrayList(curr));
        for (int i = index; i < nums.length; i++){
            curr.add(nums[i]);
            findSets(nums, i + 1, result, curr);
            curr.remove(curr.size() - 1);
        }
        
    }
}

//time:O(2^n)
//space: O(2^n)