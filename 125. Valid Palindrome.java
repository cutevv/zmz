class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s= s.toLowerCase();
        int end = s.length()-1;
        int start = 0;
        while(start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}

//time: O(n)
//space: O(1)