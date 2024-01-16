import java.util.List;

public abstract class ChessPiece {
    protected ChessBoard chessBoard;

    protected int row;
    protected int col;
    protected String color;
    protected int[][] directions;
    protected boolean hasBeenMoved = false;

    public abstract List<ChessMove> calculateLegalMoves();
    public abstract String getSymbol();

    public boolean isLegalMove(ChessMove move) {
        List<ChessMove> legalMoves = calculateLegalMoves();
        /*ChessMove testMove = new ChessMove(new String[]{String.valueOf(row),
                String.valueOf(col), String.valueOf(endRow), String.valueOf(endCol)}, this);*/

        return legalMoves.contains(move);
    }

    public ChessPiece(ChessBoard chessBoard, int row, int col, String color) {
        this.row = row;
        this.col = col;
        this.chessBoard = chessBoard;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean hasBeenMoved() {return hasBeenMoved;}

    public void setHasBeenMoved() {hasBeenMoved = true;}

    protected void moveTo(int newRow, int newCol) {
        this.row = newRow;
        this.col = newCol;
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < ChessBoard.SIZE && col >= 0 && col < ChessBoard.SIZE;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
