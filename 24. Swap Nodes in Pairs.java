class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode (0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            ListNode nextStart = cur.next.next; // preserve the next pair's start node
            prev.next = cur.next;  // null-> 1 -> 2 to null-> 2 
            cur.next.next = cur; //2 -> 1
            cur.next = nextStart; // 1 -> 3
            prev = cur; 
            cur = cur.next;
        }
        return dummy.next;     
    }
}
//time : O(n)
//space : O(1) 