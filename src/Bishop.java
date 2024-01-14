import java.util.List;

public class Bishop extends ChessPiece {

    public Bishop(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
    }

    public List<ChessMove> calculateLegalMoves() {
        return null;
    }

    public String getSymbol() {
        return (color.equals("White")) ? "♝" : "♗";
    }
}
