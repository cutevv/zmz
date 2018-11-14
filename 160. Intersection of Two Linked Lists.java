public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //get two list's length first
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        while(lenA > lenB){
            curA = curA.next;
            lenA--;
        }
        while(lenA < lenB){
            curB = curB.next;
            lenB--;           
        }
         
        while (curA != null && curB != null){
            if(curA == curB){
                return curA;
            }else{
                curA = curA.next;
                curB = curB.next;
            }   
        }
        return null;
        
    }
    private int getLength(ListNode head){
        ListNode cur = head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
}

//time: O(m+n) m is lenA, n is lenB
//space: O(1)