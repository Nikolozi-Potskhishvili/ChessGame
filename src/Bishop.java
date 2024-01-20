import java.util.ArrayList;
import java.util.List;

public class Bishop extends ChessPiece {

    public Bishop(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
        directions = new int[][]{{1,-1}, {1,1}, {-1,1}, {-1,-1}};
    }

    public List<ChessMove> calculateLegalMoves() {
        List<ChessMove> legalMoves = new ArrayList<>();

        return legalMoves;
    }

    public String getSymbol() {
        return (color.equals("White")) ? "♝" : "♗";
    }
}
