public class ChessMove {
    private int startX, startY;
    private int endX, endY;
    private ChessPiece movedPiece;
    private boolean isCapture;

    public ChessMove(int startX, int startY, int endX, int endY, ChessPiece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }
}
