public class Solution
{
    public List<Integer> inorderTraversal(TreeNode root)
    {
        // Write your solution here
        List<Integer> result = new ArrayList<Integer>();
        if (root == null)
        {
            return result;
        }
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty())
        {
            if (curr != null)
            {
                stack.offerFirst(curr);
                curr = curr.left;
            }
            // to the most left child
            else
            {
                curr = stack.pollFirst();
                result.add(curr.val);
                curr = curr.right;

            }

        }
        return result;

    }

}