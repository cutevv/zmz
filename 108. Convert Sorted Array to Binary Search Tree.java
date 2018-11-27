class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums == null || nums.length == 0){
    		return null;
    	}
    	return buildBST(nums, 0, nums.length - 1);
        
    }
    private TreeNode buildBST(int[] nums, int start, int end){
    	if(start > end){
    		return null;
    	}
    	int middle = start + (end - start) / 2; 
    	TreeNode root = new TreeNode(nums[middle]);
    	root.left = buildBST(nums, start, middle - 1);
    	root.right = buildBST(nums, middle + 1, end);
    	return root;
    }
}