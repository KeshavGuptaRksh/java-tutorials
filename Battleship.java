import java.util.Scanner;

/**
 * Battleship
 */
public class Battleship {
    static Scanner sc = new Scanner(System.in);
    public String board[][] = { { "O", "O", "O", "O", "O" }, { "O", "O", "O", "O", "O" }, { "O", "O", "O", "O", "O" },
            { "O", "O", "O", "O", "O" }, { "O", "O", "O", "O", "O" } };
    int xpos = 3;
    int ypos = 4;
    int lives = 3;

    void display_board() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total Lives : " + lives);
    }

    void play() {
        display_board();
        while (lives > 0) {

            int guess_row, guess_col;
            System.out.println("Enter row");
            guess_row = sc.nextInt();
            System.out.println("Enter Column");
            guess_col = sc.nextInt();

            if (guess_col - 1 > board.length || guess_row - 1 > board.length) {
                System.out.println("Out of the Play Area!11 Guess Again");
                display_board();
            }

            else if (xpos - 1 == guess_row - 1 && ypos - 1 == guess_col - 1) {
                System.out.println("Congratulations! You won");
                break;
            } else {
                lives--;
                System.out.println("Missed! Guess Again");
                board[guess_row - 1][guess_col - 1] = "X";
                display_board();
            }
        }
    }

    public static void main(String[] args) {
        Battleship ob = new Battleship();
        ob.play();
    }
}
