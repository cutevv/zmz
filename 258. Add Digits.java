class Solution {
    public int addDigits(int num) {
    	if (num< 10){
    		return num;
    	}
    	
   		while (num / 10 > 0){ // if the sum in the inner while loop still need to be add up 
    		int sum = 0;
    		while (num > 0){	//stop when reacing the most left digit
    			sum += num % 10;
    			num /= 10;
    		}
    		num = sum;
    	}
        return num;
    }
}
