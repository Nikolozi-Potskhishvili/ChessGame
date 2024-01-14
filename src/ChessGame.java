public class ChessGame {
    private ChessBoard chessBoard;
    private Player whitePlayer;
    private Player blackPlayer;
    private int result;

    public ChessGame() {
        this.whitePlayer = new Player("White");
        this.blackPlayer = new Player("Black");
        this.chessBoard = new ChessBoard(whitePlayer, blackPlayer);
        whitePlayer.setChessBoard(chessBoard);
        whitePlayer.setOpponent(blackPlayer);
        blackPlayer.setChessBoard(chessBoard);
        blackPlayer.setOpponent(whitePlayer);
    }


    //playes game. if white or black gets in a stealmate sets result to 1, if black wins to -2, if white to 2
    public void startGame() {
        result = 0;
        while(result == 0) {
            int whiteRes = handlePlayersMove(whitePlayer);
            if(whiteRes == 1) result = 1;
            else if(whiteRes == 2) result = -2;
            int blackRes = handlePlayersMove(blackPlayer);
            if(blackRes == 1) result = 1;
            else if(blackRes == 2) result = 2;
        }
    }

    // return 0 if regular move is player, 1 if its stealmate and 2 if checkmate
    public int handlePlayersMove(Player player) {
        if(player.isInCheck() && !player.hasLegalMoves()) {
            return 2;
        } else if(!player.hasLegalMoves()) return 1;
        handlePlayerInput(player);
        return 0;
    }

    private void handlePlayerInput(Player player) {
        String[] input;
        ChessMove move;
        ChessPiece piece;
        do {
            input = InputHandler.getMove();
            move = new ChessMove(input);
            piece = chessBoard.getChessPiece(move.getStartX(), move.getStartY());
        } while (piece == null || !piece.getColor().equals(player.getColor()));
    }
}
