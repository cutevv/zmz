class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0){
            return 0;
        } 
        int len = 0;
        int n = s.length();
        for (int i = n - 1; i >= 0 ; i--){
            if (s.charAt(i) == ' '){
                if(len == 0){
                    continue;
                }
                break;
            }
            len++;
        }
        return len;
    }
}
//time: O(n)
//space: O(1)