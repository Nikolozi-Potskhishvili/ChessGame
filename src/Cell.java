public class Cell {
    private final int xCoordinate;
    private final int yCoordinate;
    private Piece pieceOnCell;

    public Cell(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void placePiece(Piece piece) {
        pieceOnCell = piece;
    }

    public void removePiece() {
        if(!isEmpty()) pieceOnCell = null;
    }

    public boolean isEmpty() { return pieceOnCell == null;}

    public int getXCoordinate() { return xCoordinate;}

    public int getYCoordinate() { return yCoordinate;}
}
