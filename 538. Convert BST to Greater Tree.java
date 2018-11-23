class Solution {
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {  
        if(root != null){
            //do right side first, left side last
            convertBST(root.right); 
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
//time:O(n) all nodes
//space:O(h) tree height