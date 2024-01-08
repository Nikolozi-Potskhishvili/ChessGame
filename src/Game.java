public class Game {
    private Board board;
    private boolean gameIsOver = false;
    private PlayerPieces whitesPieces;
    private PlayerPieces blacksPieces;
    public Game() {
        this.board = new Board();
        whitesPieces = new PlayerPieces("White", board);
        blacksPieces = new PlayerPieces("Black", board);
        gameLoop();
    }

    private void gameLoop() {
        /*System.out.println(board.toString());
        makeMove("White");
        System.out.println(board.toString());*/
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

    private void makeMove(String color) {
        Move move = new Move(PlayerInput.getPlayersMove());
        if(color.equals("White")) {

        } else {

        }
        board.updateBoard(move);
    }
}
