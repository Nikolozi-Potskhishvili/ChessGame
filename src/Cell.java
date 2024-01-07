public class Cell {
    private final int xCoordinate;
    private final int yCoordinate;
    private Piece pieceOnCell;
    private String color;

    public Cell(int yCoordinate, int xCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Cell(int yCoordinate, int xCoordinate, Piece piece) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        pieceOnCell = piece;
    }

    public void setColor(String color) {
        this.color = color;
        //Stack<Integer> x = new Stack<>();
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

    public Piece getPieceOnCell() { return pieceOnCell;}
}
