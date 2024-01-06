public class Game {
    private Board board;
    private boolean gameIsOver = false;
    private PlayerPieces whitesPieces;
    private PlayerPieces blacksPieces;
    public Game() {
        this.board = new Board();
        gameLoop();
    }

    private void gameLoop() {
        while(!gameIsOver) {
            System.out.println(board.toString());
            makeMove("White");
            gameIsOver = checkForMate();
            if(!gameIsOver) {
                System.out.println(board.toString());
                makeMove("Black");
                gameIsOver = checkForMate();
            }

        }
    }

    private boolean checkForMate() {
        return false;
    }

    private void makeMove(String white) {

    }
}
