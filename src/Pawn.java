import java.util.List;

public class Pawn extends ChessPiece {
    public Pawn(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
    }

    public List<ChessMove> calculateLegalMoves() {
        return null;
    }

    public String getSymbol() {
        return (color.equals("White")) ? "♟" : "♙";
    }
}
