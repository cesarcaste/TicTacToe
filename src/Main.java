import java.util.Scanner;
public class Main {
    public static void game(){
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        Tictactoe game = new Tictactoe();
        game.newGame();
        game.showBoard();
        while(game.isLine() == '_'){
            try{
                System.out.println("selecciona fila: ");
                row = sc.nextInt() -1;
                System.out.println("selecciona column: ");
                col = sc.nextInt() -1;
                if(game.isEmpty(row,col)){
                    game.setToken(row,col);
                    game.showBoard();
                }else{
                    System.out.println("La posicion seleccionada ya estaba ocupada");
                }
            }catch(Exception e){
                System.out.println("Escribe un numero valido");
            }
        }
        if(game.isLine() == 'O'){
            System.out.println("Ganador: O");
        }else{
            System.out.println("Ganador: X");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("BIENVENIDO AL 3 EN RAYA");
        do{
            System.out.println("1.INICIAR NUEVA PARTIDA\n0.SALIR");
            option = sc.nextInt();
            if(option == 1){
                game();
            }
        }while(option != 0);

    }
}