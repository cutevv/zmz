class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix.length == 0){
            return;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> row_zero = new HashSet<Integer>();
        Set<Integer> col_zero = new HashSet<Integer>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    if(!row_zero.contains(i)){
                        row_zero.add(i);
                    }
                    if(!col_zero.contains(j)){
                        col_zero.add(j);
                    }
                }
            }
        }
        //mark the row has 0 cell to be all 0
        for(int r : row_zero){
            for (int c = 0; c < col; c++){
                matrix[r][c] = 0;
            }
        }
        for(int c : col_zero){
            for(int r = 0; r < row; r++){
                matrix[r][c] = 0;
            }
        }      
    }
}
//time: O(m * n)  row * col
//space: O(m + n) row + col   two sets