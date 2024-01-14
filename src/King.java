import java.util.List;

public class King extends ChessPiece {
    public King(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
    }

    public List<ChessMove> calculateLegalMoves() {
        return null;
    }

    public String getSymbol() {
        return (color.equals("White")) ? "♚" : "♔";
    }
}
