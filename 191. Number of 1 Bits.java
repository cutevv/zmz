public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for(int i = 0; i < 32; i++){ // check up to 32 bit
            if((n & mask) != 0) {// last digit is 1
            count++;
            }
            mask <<= 1;
        }
        
        
        return count;
    }
}

//time: O(n) 
//space: O(1)