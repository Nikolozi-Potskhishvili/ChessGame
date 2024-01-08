public class PlayerPieces {
    private final String color;
    private final Piece[] pieces = new Piece[16];
    private final Board board;
    public PlayerPieces(String color, Board board) {
        this.board = board;
        this.color = color;
    }

    public int getPieceIndex(Piece piece) {
        for(int i = 0; i < pieces.length; i++) {
            if(pieces[i].equals(piece)) return i;
        }
        return -1;
    }

    public boolean hasValidMoves() {
        for(int i = 0; i < pieces.length; i++) {
            //if()
        }
        return false;
    }

    public String toString() {
        String str = "";
        for(Piece piece : pieces) {
           str += piece.getPieceType() + " ";
        }
        return str;
    }

    private void initPieces() {
        initPawns();
        initRooks();
        initKnights();
        initBishops();
        initKing();
        initQueen();
    }

    private void initBishops() {
        if(color.equals("White")) {
            pieces[12] = board.getCell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE).getPieceOnCell();
            pieces[13] = board.getCell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, 7 - ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE).getPieceOnCell();
        } else {
            pieces[12] = board.getCell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE).getPieceOnCell();
            pieces[13] = board.getCell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, 7 - ChessPiecesConsts.LEFT_BISHOP_X_COORDINATE).getPieceOnCell();
        }
    }

    private void initKnights() {
        if(color.equals("White")) {
            pieces[10] = board.getCell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE).getPieceOnCell();
            pieces[11] = board.getCell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, 7 - ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE).getPieceOnCell();
        } else {
            pieces[10] = board.getCell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE).getPieceOnCell();
            pieces[11] = board.getCell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, 7 - ChessPiecesConsts.LEFT_KNIGHT_X_COORDINATE).getPieceOnCell();
        }
    }

    private void initKing() {
        if(color.equals("White")) {
            pieces[15] = board.getCell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,ChessPiecesConsts.KING_X_COORDINATE).getPieceOnCell();
        } else {
            pieces[15] = board.getCell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,ChessPiecesConsts.KING_X_COORDINATE).getPieceOnCell();
        }
    }

    private void initQueen() {
        if(color.equals("White")) {
            pieces[14] = board.getCell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,ChessPiecesConsts.QUEEN_X_COORDINATE).getPieceOnCell();
        } else {
            pieces[14] = board.getCell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,ChessPiecesConsts.QUEEN_X_COORDINATE).getPieceOnCell();
        }
    }

    private void initRooks() {
        if(color.equals("White")) {
            pieces[8] = board.getCell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE,ChessPiecesConsts.LEFT_ROOK_X_COORDINATE).getPieceOnCell();
            pieces[9] = board.getCell(ChessPiecesConsts.WHITE_PIECES_Y_COORDINATE, 7 - ChessPiecesConsts.LEFT_ROOK_X_COORDINATE).getPieceOnCell();
        } else {
            pieces[8] = board.getCell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE,ChessPiecesConsts.LEFT_ROOK_X_COORDINATE).getPieceOnCell();
            pieces[9] = board.getCell(ChessPiecesConsts.BLACK_PIECES_Y_COORDINATE, 7 - ChessPiecesConsts.LEFT_ROOK_X_COORDINATE).getPieceOnCell();
        }
    }

    private void initPawns() {
        if(color.equals("White")) {
            for(int i = 0; i < 8; i++) {
                pieces[i] = board.getCell(ChessPiecesConsts.WHITE_PAWN_Y_COORDINATE,i).getPieceOnCell();
            }
        } else {
            for(int i = 0; i < 8; i++) {
                pieces[i] = board.getCell(ChessPiecesConsts.BLACK_PAWN_Y_COORDINATE,i).getPieceOnCell();
            }
        }
    }
}
