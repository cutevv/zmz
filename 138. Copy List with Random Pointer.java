public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    // Write your solution here.
    if(head == null){
      return null;
    }
    Map<RandomListNode, RandomListNode> lookup = new HashMap<RandomListNode,RandomListNode>();
    RandomListNode newHead = new RandomListNode(head.label);
    RandomListNode curr = newHead;
    lookup.put(head, newHead);
    while(head != null){
      if(head.next != null){
        if(!lookup.containsKey(head.next)){
          lookup.put(head.next, new RandomListNode(head.next.label));
        }
        curr.next = lookup.get(head.next);
      }
      if(head.random != null){
        if(!lookup.containsKey(head.random)){
          lookup.put(head.random, new RandomListNode(head.random.label));
        }
        curr.random = lookup.get(head.random);
      }
      head= head.next;
      curr = curr.next;
    }
    return newHead;
  }
}
