class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }
        //use a queue to store next level and poll out
        Deque<TreeNode> dq = new ArrayDeque<TreeNode>();
        dq.offerLast(root);
        while(!dq.isEmpty()){
            List<Integer> curr = new ArrayList<Integer>();
            int size = dq.size();
            while(size > 0){
                TreeNode node = dq.pollFirst();
                curr.add(node.val);
                size--;
                if(node.left != null){
                    dq.offerLast(node.left);
                }
                if(node.right != null){
                    dq.offerLast(node.right);
                }
            }
            res.add(curr);
        }
        return res;
    }
}
//time: O(n)
//space: O(n)