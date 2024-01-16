import java.util.List;

public class Knight extends ChessPiece {

    public Knight(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
        directions = new int[][]{
                {-2, -1}, {-2, 1},
                {-1, -2}, {-1, 2},
                {1, -2},  {1, 2},
                {2, -1},  {2, 1}
        };
    }

    public List<ChessMove> calculateLegalMoves() {
        return null;
    }

    public String getSymbol() {
        return (color.equals("White")) ? "♞" : "♘";
    }
}
