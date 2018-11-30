class Solution
{
    public boolean search(int[] nums, int target)
    {
        if (nums == null || nums.length == 0)
        {
            return false;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
            {
                return true;
            }
            else if (nums[left] == nums[mid])
            {
                left++;
            }
            else if (nums[mid] > nums[left])
            { // left part is normal 
                if (nums[left] <= target && target <= nums[mid])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            else
            {// shifted scenario
                if (nums[mid] <= target && target <= nums[right])
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
//time: O(n)  might be O(logn) as avg?
//space O(1)