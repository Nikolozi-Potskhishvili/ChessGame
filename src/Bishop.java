import java.util.ArrayList;
import java.util.List;

public class Bishop extends ChessPiece implements ChessConstants{

    public Bishop(ChessBoard chessBoard, int row, int col, String color) {
        super(chessBoard, row, col, color);
        directions = new int[][]{{1,-1}, {1,1}, {-1,1}, {-1,-1}};
    }

    public List<ChessMove> calculateLegalMoves() {
        List<ChessMove> legalMoves = new ArrayList<>();
        for(int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            boolean encounteredPiece = false;
            while(isValid(newRow, newCol) && !encounteredPiece) {
                ChessMove chessMove = new ChessMove(row, col, newRow, newCol);
                boolean encounteredKing = isThreateningCheck(newRow, newCol);
                ChessPiece chessPiece = chessBoard.getChessPiece(newRow, newCol);
                if(chessPiece == null) {
                    legalMoves.add(chessMove);
                } else if(!chessPiece.getClass().equals(King.class)) {
                    encounteredPiece = true;
                    chessMove.setCapture();
                    legalMoves.add(chessMove);
                    continue;
                }
                newRow += dir[0];
                newCol += dir[1];
                if(encounteredKing) chessMove.setCheck();
            }
        }
        return legalMoves;
    }

    private boolean isThreateningCheck(int row, int col) {
        for(int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            boolean encounteredPiece = false;
            boolean threateningCheck = false;
            while(isValid(newRow, newCol) && !encounteredPiece && !threateningCheck) {
                ChessPiece chessPiece = chessBoard.getChessPiece(newRow, newCol);
                if(chessPiece.getClass().equals(King.class)) return true;
                else if(chessPiece.getClass() != null) encounteredPiece = true;
                else {
                    newRow += dir[0];
                    newCol += dir[1];
                }
            }
        }
        return false;
    }

    private boolean isValid(int newRow, int newCol) {
        return newRow >= 0 && newCol >= 0 && newRow < SIZE && newCol < SIZE;
    }

    public String getSymbol() {
        return (color.equals("White")) ? "♝" : "♗";
    }
}
