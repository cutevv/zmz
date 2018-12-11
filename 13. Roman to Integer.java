class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        int res = convert(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(convert(s.charAt(i)) > convert(s.charAt(i-1))){
                res += convert(s.charAt(i)) - 2 * convert(s.charAt(i-1));
            }else{
                res += convert(s.charAt(i));
            }
        }
        return res;
    }
    
    private static int convert (char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;                            
            case 'D' : return 500;
            case 'M': return 1000;      
        }
        return 0;
    }
}

//time: O(n)
//space: O(1)