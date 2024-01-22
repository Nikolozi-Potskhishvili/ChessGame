import java.util.Arrays;

public class ChessGame {
    private ChessBoard chessBoard;
    private Player whitePlayer;
    private Player blackPlayer;
    private int result;
    private ChessGraphics graphics;
    private boolean whiteInCheck = false;
    private boolean blackInCheck = false;
    public ChessGame() {
        this.whitePlayer = new Player("White");
        this.blackPlayer = new Player("Black");
        this.chessBoard = new ChessBoard(whitePlayer, blackPlayer);
        whitePlayer.setChessBoard(chessBoard);
        whitePlayer.setOpponent(blackPlayer);
        blackPlayer.setChessBoard(chessBoard);
        blackPlayer.setOpponent(whitePlayer);
        graphics = new ChessGraphics(chessBoard);
    }


    //playes game. if white or black gets in a stealmate sets result to 1, if black wins to -2, if white to 2
    public void startGame() {
        result = 0;
        while(result == 0) {
            System.out.println("White");
            System.out.println(chessBoard.toString());
            graphics.updateGraphics();
            int whiteRes = handlePlayersMove(whitePlayer);
            if(whiteRes == 1) result = 1;
            else if(whiteRes == 2) result = -2;
            System.out.println("Black");
            System.out.println(chessBoard.toString());
            graphics.updateGraphics();
            int blackRes = handlePlayersMove(blackPlayer);
            if(blackRes == 1) result = 1;
            else if(blackRes == 2) result = 2;
        }
    }

    // return 0 if regular move is player, 1 if its stealmate and 2 if checkmate
    private int handlePlayersMove(Player player) {
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
            System.out.println(Arrays.toString(input));
            move = new ChessMove(input);
            piece = chessBoard.getChessPiece(move.getStartY(), move.getStartX());
        } while (piece == null || !piece.getColor().equals(player.getColor()) || !piece.isLegalMove(move));
        if(move.isCapture()) {
            chessBoard.removePiece(move.getEndY(), move.getEndX());
        }
        chessBoard.makeMove(move);
    }
}
