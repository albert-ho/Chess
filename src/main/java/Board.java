import java.util.Arrays;

public class Board {

    private String[][] board;

    public Board() {
        this.board = new String[3][3];
        for (String[] row: board) {
            Arrays.fill(row, " ");
        }
    }

    // TODO: Cleanup such that code is more concise
    public void display() {
        for (String[] row: board) {
            System.out.println(" - - - ");
            String strRow = String.format("|%s|%s|%s|", row[0], row[1], row[2]);
            System.out.println(strRow);
        }
        System.out.println(" - - - ");
    }

    public void setMove(Move move) {
        board[move.x][move.y] = move.type;
    }

    // TODO: Check entire board to see if winner created
    // TODO: If no winner, report Tie
    public boolean isOver() {
        return true;
    }
}
