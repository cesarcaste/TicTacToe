public class Tictactoe {
    private boolean player; // false es la X
    private char board [][] = new char [3][3];

    public Tictactoe() {
        this.player = false;
    }

    //This function sets up the board for a new game
    public void newGame(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '_';
            }
        }
    }

    //Shows the board
    public void showBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    //Find is the pos is eligible for set a new token
    public boolean isEmpty(int row, int col){
        return board[row][col] == '_';
    }

    //Set a token in the chosen position
    public void setToken (int row, int col){
        if (player){
            board[row][col] = 'O';
            player = false;
        }else{
            board[row][col] = 'X';
            player = true;
        }
    }

    private char isVerticalLine(){
        for(int i = 0; i < 3; i++){
            int count = 0;
            for(int j = 0; j < 3; j++){
                if(board[j][i] == 'X'){count++;}
            }
            if(count == 3){
                return 'X';
            }
        }
        for(int i = 0; i < 3; i++){
            int count = 0;
            for(int j = 0; j < 3; j++){
                if(board[j][i] == 'O'){count++;}
            }
            if(count == 3){
                return 'O';
            }
        }
        return '_';
    }

    private char isHorizontalLine(){
        for(int i = 0; i < 3; i++){
            int count = 0;
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 'X'){count++;}
            }
            if(count == 3){
                return 'X';
            }
        }
        for(int i = 0; i < 3; i++){
            int count = 0;
            for(int j = 0; j < 3; j++){
                if(board[i][j] == 'O'){count++;}
            }
            if(count == 3){
                return 'O';
            }
        }
        return '_';
    }
    private char isDiagonal(){
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
            return 'X';
        }
        if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
            return 'O';
        }
        return '_';
    }

    public char isLine (){

       if(isHorizontalLine() != '_'){
           return isHorizontalLine();
       }
       if(isVerticalLine() != '_'){
           return isVerticalLine();
       }
       if(isDiagonal() != '_'){
           return isDiagonal();
       }
       return '_';
    }
}
