class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        
        //first, swap with diagnoal direction 
        for (int i = 0; i < row; i++){
            for (int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            } 
        }
        //secondly, swap from middle line, keep the middle column's element 
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row-1-j];
                matrix[i][row-1-j] = temp;
            }
        }
    }
}

//time: O(m * n) row* col
//space: O(1)
