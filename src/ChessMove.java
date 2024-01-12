public class ChessMove {
    private int startX, startY;
    private int endX, endY;
    private ChessPiece movedPiece;
    private boolean isCapture;

    public ChessMove(String[] input) {
        convertInputToData(input);
        //this.movedPiece = movedPiece;
    }

    private void convertInputToData(String[] input) {
        this.startX = Integer.valueOf(input[1]) - 1;
        this.startY = input[0].charAt(0) - 'A';
        this.endX = Integer.valueOf(input[3]) - 1;;
        this.endY = input[0].charAt(0) - 'A';
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public ChessPiece getMovedPiece() {
        return movedPiece;
    }

    public boolean isCapture() {
        return isCapture;
    }

}
