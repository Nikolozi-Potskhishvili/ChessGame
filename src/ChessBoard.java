public class ChessBoard {
    public static final int SIZE = 8;
    private final ChessPiece[][] chessBoard = new ChessPiece[SIZE][SIZE];

    private Player currentPlayer;
    private Player whitePlayer;
    private Player blackPlayer;

    public ChessBoard(Player whitePlayer, Player blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        initBoard();
    }

    public ChessPiece getChessPiece(int row, int col) {
        if(chessBoard[row][col] == null) return null;
        else return chessBoard[row][col];
    }

    private void initBoard() {

    }

    private void updateBoard(ChessMove move) {

    }
}
