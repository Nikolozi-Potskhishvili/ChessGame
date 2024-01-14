import java.util.ArrayList;
import java.util.List;

public class Player implements ChessConstants {
    private ChessBoard chessBoard;
    private Player opponent;

    private String color;
    private List<ChessPiece> playersPieces;

    public Player(String color) {
        this.color = color;
        playersPieces = new ArrayList<>();
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public boolean isInCheck() {
        return false;
    }

    public boolean hasLegalMoves() {
        return true;
    }

    public String getColor() {return color;}

    public void makeMove() {

    }

    private void initPieces() {
        int pawnRow = (color.equals("White")) ? WHITE_PAWN_ROW : SIZE - WHITE_PAWN_ROW - 1;
        int pieceRow = (color.equals("White")) ? WHITE_PIECE_ROW : SIZE - WHITE_PIECE_ROW - 1;
        for(int c = 0; c < SIZE; c++) {
            playersPieces.add(chessBoard.getChessPiece(pawnRow,c));
            playersPieces.add(chessBoard.getChessPiece(pieceRow,c));
        }

    }

    private void updatePieces(ChessMove move) {

    }

}
