class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if(n == 0){
            return res;
        }
        StringBuilder sb = new StringBuilder(); 
        buildParentheses(sb, n, 0, 0, res);
        return res;
        
    }
    private void buildParentheses(StringBuilder sb,int n, int left, int right, List<String> res){
    	if(left == n && right == n){
    		res.add(sb.toString());
    		return;
    	}
    	if(left < n){
    		sb.append('(');
    		buildParentheses(sb, n, left + 1, right, res);
    		sb.deleteCharAt(sb.length() - 1);
    	}
    	if(right < left){
    		sb.append(')');
    		buildParentheses(sb, n, left, right +1, res);
    		sb.deleteCharAt(sb.length() - 1);
    	}
    }
}
//time: O(2(2^n))
//space: O(n)
