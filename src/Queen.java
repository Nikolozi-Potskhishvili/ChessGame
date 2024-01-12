import java.util.List;

public class Queen extends ChessPiece {

    public Queen(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
    }

    public List<ChessMove> calculateLegalMoves() {
        return null;
    }
}
