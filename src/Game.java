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
            makeMove("White");
            gameIsOver = checkForMate();
            if(!gameIsOver) {
                makeMove("Black");
                gameIsOver = checkForMate();
            }

        }
    }

    private boolean checkForMate() {

    }

    private void makeMove(String white) {

    }
}
