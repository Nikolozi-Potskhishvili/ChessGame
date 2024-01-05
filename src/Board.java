public class Board {
    private final int[][] board = new int[8][8];

    public Board() {
        initStartingPosition();
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
    }

    private void initKings() {
        board[0][4] = ChessPiecesConsts.KING;
        board[board.length - 1][4] = ChessPiecesConsts.KING;
    }

    private void initQueens() {
        board[0][3] = ChessPiecesConsts.QUEEN;
        board[board.length - 1][3] = ChessPiecesConsts.QUEEN;
    }

    private void initRooks() {
        board[0][0] = ChessPiecesConsts.ROOK;
        board[0][board[0].length - 1] = ChessPiecesConsts.ROOK;
        board[board.length - 1][0] = ChessPiecesConsts.ROOK;
        board[board.length - 1][board[0].length - 1] = ChessPiecesConsts.ROOK;
    }

    private void initBishops() {
        board[0][2] = ChessPiecesConsts.BISHOP;
        board[0][board[0].length - 1 - 2] = ChessPiecesConsts.BISHOP;
        board[board.length - 1][2] = ChessPiecesConsts.BISHOP;
        board[board.length - 1][board[0].length - 1 - 2] = ChessPiecesConsts.BISHOP;
    }

    private void initKnights() {
        board[0][1] = ChessPiecesConsts.KNIGHT;
        board[0][board[0].length - 1 - 1] = ChessPiecesConsts.KNIGHT;
        board[board.length - 1][1] = ChessPiecesConsts.KNIGHT;
        board[board.length - 1][board[0].length - 1 - 1] = ChessPiecesConsts.KNIGHT;
    }

    private void initPawns() {
        for(int i = 0; i < board[0].length; i++) {
            board[1][i] = ChessPiecesConsts.PAWN;
            board[board.length - 1][i] = ChessPiecesConsts.PAWN;
        }
    }
}
