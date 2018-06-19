public class TicTacToe implements Game {

    private Board board;
    private Player[] players;
    private int turn;

    public TicTacToe() {
        this.board = new Board();
        Player pX = new Player("X");
        Player pO = new Player("O");
        Player[] players = {pX, pO};
        this.players = players;
        this.turn = 0;
    }

    private void nextTurn() {
        turn = (turn+1) % players.length;
    }

    public void play() {
        while (true) {
            Player p = players[turn];
            Move move = p.makeMove();
            board.setMove(move);
            board.display();
            if (board.isOver()) {
                // TODO: Handle tie situation
                String msg = String.format("Winner is: Player %s", p.type);
                System.out.println(msg);
                break;
            }
            nextTurn();
        }
    }

    public static void main(String[] args) {
        TicTacToe test = new TicTacToe();
        test.play();
    }
}
