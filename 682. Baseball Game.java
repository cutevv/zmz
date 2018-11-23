class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        for(String op : ops){
            if(op.equals("+")){// sum of the last two valid round's points.
                int oldFirst = deque.pollFirst();
                int oldSecond = deque.peekFirst();
                deque.offerFirst(oldFirst);
                deque.offerFirst(oldFirst + oldSecond);     
            }
            else if(op.equals("D")){//doubled data of the last valid round's points.
                deque.offerFirst(2 * deque.peekFirst());
                
            }
            else if(op.equals("C")){ //Rremove last valid round's points
                deque.pollFirst();
            }
            else{
                deque.offerFirst(Integer.valueOf(op));
            }
        }
        int score = 0;
        for(int num : deque){
            score += num;
        }
        return score;
    }
}
//time: O(n)
//space: O(n)