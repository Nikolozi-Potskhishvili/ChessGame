public class ChessGame {
    private ChessBoard chessBoard;
    private Player whitePlayer;
    private Player blackPlayer;

    public ChessGame() {
        this.chessBoard = new ChessBoard(whitePlayer, blackPlayer);
        this.whitePlayer = new Player(chessBoard, blackPlayer);
        this.blackPlayer = new Player(chessBoard, whitePlayer);
    }

    public void startGame() {

    }
}
