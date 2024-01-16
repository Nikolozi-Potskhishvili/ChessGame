import java.util.List;

public class Rook extends ChessPiece {

    public Rook(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
        directions = new int[][]{{-1,0}, {1,0}, {0,1}, {0,-1}};
    }

    public List<ChessMove> calculateLegalMoves() {

        return null;
    }

    public String getSymbol() {
        return (color.equals("White")) ? "♜" : "♖";
    }
}
