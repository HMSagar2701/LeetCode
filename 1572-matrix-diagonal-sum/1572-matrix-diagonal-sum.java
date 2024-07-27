class Solution {
    public int diagonalSum(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int sum=0;
        
        for(int row=0 ; row < r; row++){
            int primaryDia = mat[row][row];
            int secondaryDia = mat[row][c-1-row];
            sum+=primaryDia;
            if(row!=(c-1-row))
                sum+=secondaryDia;
        }
        return sum;
    }
}