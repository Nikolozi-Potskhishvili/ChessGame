public class ChessMove {
    private int startX, startY;
    private int endX, endY;
    private ChessPiece movedPiece;
    private boolean isCapture;
    private boolean isCheck;

    public ChessMove(String[] input) {
        convertInputToData(input);
        //this.movedPiece = movedPiece;
    }

    public ChessMove(int startY, int startX, int endY, int endX) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void setCapture() {isCapture = true;}

    public void setCheck() {isCheck = true;}

    private void convertInputToData(String[] input) {
        this.startX = input[0].charAt(0) - 'A';
        this.startY = Integer.valueOf(input[1]) - 1;
        this.endX = input[2].charAt(0) - 'A';
        this.endY = Integer.valueOf(input[3]) - 1;
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
