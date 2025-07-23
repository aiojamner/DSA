public class NQueens {

    public static void main(String[] args){
        int n = 4;
        char[][] board = new char[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        solve(0,board);
    }

    public static void solve(int row, char[][] board){
        if (row == board.length){
            printBoard(board);
            return;
        }

        for (int i=0;i<board.length;i++){
            if (isSafe(board,row,i)){
                board[row][i] = 'Q';
                solve((row+1),board);
                board[row][i] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){

        for (int i=0;i<row;i++){
            if (board[i][col] == 'Q')
            return false;
        }

        for (int i=row-1, j=col-1;i>=0 && j>=0; i--,j--){
            if (board[i][j] =='Q')return false;
        }

        return true;

    }

    public static void printBoard(char[][] board){
        for (char[] row : board){
            for (char ch : row){
                System.out.print(ch+ " ");

            }
            System.out.println();
        }
    }
}
