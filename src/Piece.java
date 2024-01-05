public class Piece {
    private enum PieceTypes {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING;
    }

    private PieceTypes type;
    private int xCoordinate;
    private int yCoordinate;
    private boolean isAlive;

    public Piece(PieceTypes type, int xCoordinate, int yCoordinate) {
        this.type = type;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        isAlive = true;
    }

    public void killPiece() {
        isAlive = false;
    }

    public void movePiece(int newXCoordinate, int newYCoordinate) {
        xCoordinate = newXCoordinate;
        yCoordinate = newYCoordinate;
    }

}
