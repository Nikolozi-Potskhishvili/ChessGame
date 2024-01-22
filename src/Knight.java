import java.util.ArrayList;
import java.util.List;

public class Knight extends ChessPiece implements ChessConstants{

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
        List<ChessMove> legalMoves = new ArrayList<>();
        for(int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            boolean threateningCheck = isThreateningCheck(newRow, newCol);
            ChessMove chessMove = new ChessMove(row, col, newRow, newCol);
            ChessPiece pieceOnCell = chessBoard.getChessPiece(newRow, newCol);
            if(isValidPosition(newRow, newCol) && (pieceOnCell == null || !chessBoard.getChessPiece(newRow, newCol).getClass().equals(King.class))) {
                if(pieceOnCell == null) chessMove.setCapture();
                if(threateningCheck) chessMove.setCheck();
                legalMoves.add(chessMove);
            }
        }
        return legalMoves;
    }

    private boolean isThreateningCheck(int curRow, int curCol) {
        for (int[] dir : directions) {
            int newRow = curRow + dir[0];
            int newCol = curCol + dir[1];
            if (isValidPosition(newRow, newCol) && chessBoard.getChessPiece(newRow, newCol) != null &&
                    chessBoard.getChessPiece(newRow, newCol).getClass().equals(King.class)) {
                return true;
            }
        }
        return false;
    }

    public String getSymbol() {
        return (color.equals("White")) ? "♞" : "♘";
    }
}
