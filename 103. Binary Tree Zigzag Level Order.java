class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }
        Deque<TreeNode> dq = new ArrayDeque<TreeNode>();
        int layer = 0; 
        dq.offerFirst(root);
        while(!dq.isEmpty()){
            int size = dq.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                if(layer == 0){ // even layer
                    TreeNode node = dq.pollFirst();
                    list.add(node.val);
                    if(node.left != null){
                        dq.offerLast(node.left);
                    }
                    if(node.right != null){
                        dq.offerLast(node.right);
                    }
                        
                }
                else{
                    TreeNode node = dq.pollLast();
                    list.add(node.val);
                    if(node.right != null){
                        dq.offerFirst(node.right);
                    }
                    if(node.left != null){
                        dq.offerFirst(node.left);
                    }
                }
            }
            layer = 1 - layer;
            res.add(list);
            
        }
        return res;
        
    }
}