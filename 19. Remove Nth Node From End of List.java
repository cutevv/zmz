class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode tail = dummy;
        while(tail != null && n >= 0){
            tail = tail.next;
            n--;
        }
        //if n is larger than list length
        if(n > 0){
            return null;            
        }
        while(tail != null){
            cur = cur.next;
            tail = tail.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
}
//time: O(n)
//space: O(1)