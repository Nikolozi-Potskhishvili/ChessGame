public class Board {
    private final Cell[][] board = new Cell[8][8];

    public Board() {
        initStartingPosition();
        setCellsColors();
    }

    public void updateBoard(Move move) {
        Piece tempPiece = board[move.getFirstCellY()][move.getFirstCellX()].getPieceOnCell();
        board[move.getFirstCellY()][move.getFirstCellX()].removePiece();
        board[move.getSecondCellY()][move.getFirstCellY()].placePiece(tempPiece);

    }

    private void setCellsColors() {
        for(int i = 0; i < board.length; i++) {
            for(int k = 0; k < board[0].length; k++) {
                if((i + k) % 2 == 0) board[i][k].setColor("BLACK");
                else board[i][k].setColor("WHITE");
            }
        }
    }

    private void initStartingPosition() {
        initPawns();
        initPieces();
    }

    private void initPieces() {
        initKnights();
        initBishops();
        initRooks();
        initQueens();
        initKings();
        initEmptyCells();
    }

    private void initEmptyCells() {
        for(int i = ChessPiecesConsts.WHITE_PAWN_Y_COORDINATE + 1; i < ChessPiecesConsts.BLACK_PAWN_Y_COORDINATE; i++) {
            for(int k = 0; k < board[0].length; k++) {
                board[i][k] = new Cell(i,k);
            }
        }
    }

    private void initKings() {
        board[ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE][ChessPiecesConsts.KING_X_COORDINATE] = new Cell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,
                ChessPiecesConsts.KING_X_COORDINATE,
                new Piece(Piece.PieceTypes.KING, ChessPiecesConsts.KING_X_COORDINATE, ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, "WHITE"));
        board[ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE][ChessPiecesConsts.KING_X_COORDINATE] = new Cell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,
                ChessPiecesConsts.KING_X_COORDINATE,
                new Piece(Piece.PieceTypes.KING, ChessPiecesConsts.KING_X_COORDINATE, ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, "BLACK"));

    }

    private void initQueens() {
        board[ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE][ChessPiecesConsts.QUEEN_X_COORDINATE] = new Cell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,
                ChessPiecesConsts.QUEEN_X_COORDINATE,
                new Piece(Piece.PieceTypes.QUEEN, ChessPiecesConsts.QUEEN_X_COORDINATE, ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, "WHITE"));
        board[ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE][ChessPiecesConsts.QUEEN_X_COORDINATE] = new Cell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,
                ChessPiecesConsts.LEFT_ROOK_X_COORDINATE,
                new Piece(Piece.PieceTypes.QUEEN, ChessPiecesConsts.QUEEN_X_COORDINATE, ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, "BLACK"));
    }

    private void initRooks() {
        board[ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE][ChessPiecesConsts.LEFT_ROOK_X_COORDINATE] = new Cell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,
                ChessPiecesConsts.LEFT_ROOK_X_COORDINATE,
                new Piece(Piece.PieceTypes.ROOK, ChessPiecesConsts.LEFT_ROOK_X_COORDINATE, ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, "WHITE"));
        board[ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE][board[0].length - 1 - ChessPiecesConsts.LEFT_ROOK_X_COORDINATE] = new Cell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,
                board[0].length - 1 - ChessPiecesConsts.LEFT_ROOK_X_COORDINATE,
                new Piece(Piece.PieceTypes.ROOK, board[0].length - 1 - ChessPiecesConsts.LEFT_ROOK_X_COORDINATE, ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, "WHITE"));
        board[ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE][ChessPiecesConsts.LEFT_ROOK_X_COORDINATE] = new Cell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,
                ChessPiecesConsts.LEFT_ROOK_X_COORDINATE,
                new Piece(Piece.PieceTypes.ROOK, ChessPiecesConsts.LEFT_ROOK_X_COORDINATE, ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, "BLACK"));
        board[ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE][board[0].length - 1 - ChessPiecesConsts.LEFT_ROOK_X_COORDINATE] = new Cell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,
                board[0].length - 1 - ChessPiecesConsts.LEFT_ROOK_X_COORDINATE,
                new Piece(Piece.PieceTypes.ROOK, board[0].length - 1 - ChessPiecesConsts.LEFT_ROOK_X_COORDINATE, ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, "BLACK"));
    }

    private void initBishops() {
        board[ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE][ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE] = new Cell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,
                ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE,
                new Piece(Piece.PieceTypes.BISHOP, ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE, ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, "WHITE"));
        board[ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE][board[0].length - 1 - ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE] = new Cell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,
                board[0].length - 1 - ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE,
                new Piece(Piece.PieceTypes.BISHOP, board[0].length - 1 - ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE, ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, "WHITE"));
        board[ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE][ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE] = new Cell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,
                ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE,
                new Piece(Piece.PieceTypes.BISHOP, ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE, ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, "BLACK"));
        board[ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE][board[0].length - 1 - ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE] = new Cell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,
                board[0].length - 1 - ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE,
                new Piece(Piece.PieceTypes.BISHOP, board[0].length - 1 - ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE, ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, "BLACK"));
    }

    private void initKnights() {
        board[ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE][ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE] = new Cell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,
                ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE,
                new Piece(Piece.PieceTypes.KNIGHT, ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE, ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, "WHITE"));
        board[ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE][board[0].length - 1 - ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE] = new Cell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,
                board[0].length - 1 - ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE,
                new Piece(Piece.PieceTypes.KNIGHT, board[0].length - 1 - ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE, ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, "WHITE"));
        board[ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE][ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE] = new Cell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,
                ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE,
                new Piece(Piece.PieceTypes.KNIGHT, ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE, ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, "BLACK"));
        board[ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE][board[0].length - 1 - ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE] = new Cell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,
                board[0].length - 1 - ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE,
                new Piece(Piece.PieceTypes.KNIGHT, board[0].length - 1 - ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE, ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, "BLACK"));
    }

    private void initPawns() {
        for(int i = 0; i < board[0].length; i++) {
            board[ChessPiecesConsts.WHITE_PAWN_Y_COORDINATE][i] = new Cell(ChessPiecesConsts.WHITE_PAWN_Y_COORDINATE,i,
                    new Piece(Piece.PieceTypes.PAWN, i, ChessPiecesConsts.WHITE_PAWN_Y_COORDINATE, "WHITE"));
            board[ChessPiecesConsts.BLACK_PAWN_Y_COORDINATE][i] = new Cell(ChessPiecesConsts.BLACK_PAWN_Y_COORDINATE, i,
                    new Piece(Piece.PieceTypes.PAWN, i, ChessPiecesConsts.BLACK_PAWN_Y_COORDINATE, "BLACK"));
        }
    }

    public String toString() {
        String str = "";
        for(int i = 0; i < board.length; i++) {
            for(int k = 0; k < board[0].length; k++) {
                if(board[i][k].isEmpty()) str += "#" + " ";
                else str += board[i][k].getPieceOnCell().getPieceType() + " ";
            }
            str += '\n';
        }
        return str;
    }
}
