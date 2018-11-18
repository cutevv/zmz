class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() ==0 ){
            return true;
        }
        
        Deque<Character> deque = new ArrayDeque<Character>();
        for (char c : s.toCharArray()){
            if(c == '('){
                deque.push(')');
            }
            else if (c == '['){
                deque.push(']');
            }else if(c == '{'){
                deque.push('}');
            }else{  // when the s is only one ')' or ']' or '}', the deque will be empty, check with deque.isEmpty() 
                if(deque.isEmpty() || deque.pop() != c)
                    return false;
            }
        }
        return deque.isEmpty();
        
    }
}
//time: O(n)
//space: O(n)