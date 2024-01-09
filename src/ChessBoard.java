public class ChessBoard {
    private final ChessPiece[][] chessBoard = new ChessPiece[8][8];

    private Player currentPlayer;
    private Player whitePlayer;
    private Player blackPlayer;

    public ChessBoard(Player whitePlayer, Player blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        initBoard();
    }

    private void initBoard() {

    }
}
