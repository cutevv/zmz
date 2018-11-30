class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){ // leaf node
            return 1;
        }
   		int min = Integer.MAX_VALUE;
        if(root.left != null){
          min = Math.min(min, minDepth(root.left));
        }
        if(root.right != null){
          min = Math.min(min, minDepth(root.right));
        }
        
        return min + 1;
    }
    
}