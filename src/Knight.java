import java.util.List;

public class Knight extends ChessPiece {

    public Knight(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
    }

    public List<ChessMove> calculateLegalMoves() {
        return null;
    }
}
