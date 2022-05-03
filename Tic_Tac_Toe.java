/**
 * Tic_Tac_Toe
 */
public class Tic_Tac_Toe {

    static String board[][] = { { "", "", "" }, { "", "", "" }, { "", "", "" } };
    int player = 1;

    void display_board() {
        System.out.println(board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);
        System.out.println("__|____|___");
        System.out.println(board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);
        System.out.println("__|____|___");
        System.out.println(board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);
        System.out.println("  |    |   ");
    }

    boolean win() {
        if (board[0][0].equalsIgnoreCase(board[0][1]) && board[0][0].equalsIgnoreCase(board[0][2]) ||
                (board[1][0].equalsIgnoreCase(board[1][1]) && board[1][0].equalsIgnoreCase(board[1][2])) ||
                (board[2][0].equalsIgnoreCase(board[2][1]) && board[2][0].equalsIgnoreCase(board[2][2])) ||
                (board[0][0].equalsIgnoreCase(board[1][0]) && board[1][0].equalsIgnoreCase(board[2][0])) ||
                (board[0][1].equalsIgnoreCase(board[1][1]) && board[1][1].equalsIgnoreCase(board[2][1])) ||
                (board[0][2].equalsIgnoreCase(board[1][2]) && board[1][2].equalsIgnoreCase(board[2][2])) ||
                (board[0][0].equalsIgnoreCase(board[1][1]) && board[1][1].equalsIgnoreCase(board[2][2])) ||
                (board[0][2].equalsIgnoreCase(board[1][1]) && board[1][1].equalsIgnoreCase(board[2][0])))
            return true;
        else
            return false;
    }

    void toggle_Player() {
        if (player == 1)
            player++;
        else
            player--;
        System.out.println("Player " + player + " take yout turn");
    }

    void play() {
        display_board();
        if (win() == true)
            System.out.println("Player 1 Won the game");
    }

    public static void main(String[] args) {
        Tic_Tac_Toe ob = new Tic_Tac_Toe();
        // ob.play();
        ob.toggle_Player();
        ob.toggle_Player();
        ob.toggle_Player();
    }
}