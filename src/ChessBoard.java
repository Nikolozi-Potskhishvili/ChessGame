public class ChessBoard implements ChessConstants {
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

    public void makeMove(ChessMove move) {
        System.out.println(move.getStartX());
        System.out.println(move.getStartY());
        ChessPiece curPiece = chessBoard[move.getStartY()][move.getStartX()];
        chessBoard[move.getStartY()][move.getStartX()] = null;
        chessBoard[move.getEndY()][move.getEndX()] = curPiece;
        System.out.println(curPiece.getSymbol());
    }

    public ChessPiece getChessPiece(int row, int col) {
        if(chessBoard[row][col] == null) return null;
        else return chessBoard[row][col];
    }

    private void initBoard() {
        initPawns();
        initRooks();
        initKnights();
        initBishops();
        initKings();
        initQueens();
    }

    public void removePiece(int row, int col) {chessBoard[row][col] = null;}

    private void initPawns() {
        for(int i = 0; i < SIZE; i++) {
            chessBoard[WHITE_PAWN_ROW][i] = new Pawn(this, WHITE_PAWN_ROW, i, "White");
            chessBoard[SIZE - WHITE_PAWN_ROW - 1][i] = new Pawn(this, SIZE - WHITE_PAWN_ROW - 1, i, "Black");
        }
    }

    private void initRooks() {
        chessBoard[WHITE_PIECE_ROW][LEFT_ROOK_COLUMN] = new Rook(this, WHITE_PIECE_ROW, LEFT_ROOK_COLUMN, "White");
        chessBoard[WHITE_PIECE_ROW][SIZE - LEFT_ROOK_COLUMN - 1] = new Rook(this, WHITE_PIECE_ROW, SIZE - LEFT_ROOK_COLUMN - 1, "White");
        chessBoard[SIZE - WHITE_PIECE_ROW - 1][LEFT_ROOK_COLUMN] = new Rook(this, SIZE - WHITE_PIECE_ROW - 1, LEFT_ROOK_COLUMN, "Black");
        chessBoard[SIZE - WHITE_PIECE_ROW - 1][SIZE - LEFT_ROOK_COLUMN - 1] = new Rook(this, WHITE_PIECE_ROW, SIZE - LEFT_ROOK_COLUMN - 1, "Black");
    }

    private void initKnights() {
        chessBoard[WHITE_PIECE_ROW][LEFT_KNIGHT_COLUMN] = new Knight(this, WHITE_PIECE_ROW, LEFT_KNIGHT_COLUMN, "White");
        chessBoard[WHITE_PIECE_ROW][SIZE - LEFT_KNIGHT_COLUMN - 1] = new Knight(this, WHITE_PIECE_ROW, SIZE - LEFT_KNIGHT_COLUMN - 1, "White");
        chessBoard[SIZE - WHITE_PIECE_ROW - 1][LEFT_KNIGHT_COLUMN] = new Knight(this, SIZE - WHITE_PIECE_ROW - 1, LEFT_KNIGHT_COLUMN, "Black");
        chessBoard[SIZE - WHITE_PIECE_ROW - 1][SIZE - LEFT_KNIGHT_COLUMN - 1] = new Knight(this, WHITE_PIECE_ROW, SIZE - LEFT_KNIGHT_COLUMN - 1, "Black");
    }

    private void initBishops() {
        chessBoard[WHITE_PIECE_ROW][LEFT_BISHOP_COLUMN] = new Bishop(this, WHITE_PIECE_ROW, LEFT_BISHOP_COLUMN, "White");
        chessBoard[WHITE_PIECE_ROW][SIZE - LEFT_BISHOP_COLUMN - 1] = new Bishop(this, WHITE_PIECE_ROW, SIZE - LEFT_BISHOP_COLUMN - 1, "White");
        chessBoard[SIZE - WHITE_PIECE_ROW - 1][LEFT_BISHOP_COLUMN] = new Bishop(this, SIZE - WHITE_PIECE_ROW - 1, LEFT_BISHOP_COLUMN, "Black");
        chessBoard[SIZE - WHITE_PIECE_ROW - 1][SIZE - LEFT_BISHOP_COLUMN - 1] = new Bishop(this, WHITE_PIECE_ROW, SIZE - LEFT_BISHOP_COLUMN - 1, "Black");
    }

    private void initKings() {
        chessBoard[WHITE_PIECE_ROW][KING_COLUMN] = new King(this, WHITE_PIECE_ROW, KING_COLUMN, "White");
        chessBoard[SIZE - WHITE_PIECE_ROW - 1][KING_COLUMN] = new King(this, SIZE - WHITE_PIECE_ROW - 1, KING_COLUMN, "Black");
    }

    private void initQueens() {
        chessBoard[WHITE_PIECE_ROW][QUEEN_COLUMN] = new Queen(this, WHITE_PIECE_ROW, QUEEN_COLUMN, "White");
        chessBoard[SIZE - WHITE_PIECE_ROW - 1][QUEEN_COLUMN] = new Queen(this, SIZE - WHITE_PIECE_ROW - 1, QUEEN_COLUMN, "Black");
    }

    private void updateBoard(ChessMove move) {

    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        // Append column letters
        res.append("  ");
        for (int c = 0; c < SIZE; c++) {
            res.append((char)('A' + c) + "  "); // Append column letter with spacing
        }
        res.append('\n');
        // Append board rows
        for (int r = SIZE - 1; r >= 0; r--) {
            res.append(r + 1 + " "); // Append row number
            for (int c = 0; c < SIZE; c++) {
                ChessPiece piece = this.getChessPiece(r, c);
                if (piece == null) {
                    res.append(((r + c) % 2 == 0) ? "□" + " " : "■" + " "); // Append square symbol with spacing
                } else {
                    res.append(piece.getSymbol() + " "); // Append the piece representation with spacing
                }
            }
            res.append(r + 1 + " "); // Append row number
            res.append('\n');
        }
        // Append column letters again
        res.append("  ");
        for (int c = 0; c < SIZE; c++) {
            res.append((char)('A' + c) + "  "); // Append column letter with spacing
        }
        res.append('\n');
        return res.toString();
    }
}
