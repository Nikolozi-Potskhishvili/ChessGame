import java.util.List;

public class King extends ChessPiece {
    public King(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
        directions = new int[][]{{1,-1}, {1,1}, {-1,1}, {-1,-1},
                {-1,0}, {1,0}, {0,1}, {0,-1}};
    }

    public List<ChessMove> calculateLegalMoves() {
        return null;
    }

  /*  private boolean shortCastleIsPossible() {
        if()
    }

    private boolean longCastleIsPossible() {

    }*/

    public String getSymbol() {
        return (color.equals("White")) ? "♚" : "♔";
    }
}
