import java.util.Scanner;

public class Player {

    public final String type;
    private Move[] moves;

    public Player(String type) {
        this.type = type;
    }

    // TODO: Read in input for Player (show prompt beforehand)
    // TODO: Check if move is legal
    public Move makeMove() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return new Move(type, 0, 0);
    }
}
