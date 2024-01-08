public class Piece {
    public enum PieceTypes {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING;
    }

    private PieceTypes type;
    private final String Color;
    private int xCoordinate;
    private int yCoordinate;
    private boolean isAlive;

    public Piece(PieceTypes type, int xCoordinate, int yCoordinate, String Color) {
        this.type = type;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.Color = Color;
        isAlive = true;
    }

    public void killPiece() {
        isAlive = false;
    }

    public void movePiece(int newXCoordinate, int newYCoordinate) {
        xCoordinate = newXCoordinate;
        yCoordinate = newYCoordinate;
    }

    public String getPieceType() {
        if(this == null) return "empty";
        if(type.equals(PieceTypes.BISHOP)) {
            return "B";
        } else if(type.equals(PieceTypes.KNIGHT)) {
            return "H";
        } else if(type.equals(PieceTypes.ROOK)) {
            return "R";
        } else if(type.equals(PieceTypes.QUEEN)) {
            return "Q";
        } else if(type.equals(PieceTypes.KING)) {
            return "K";
        } else if(type.equals(PieceTypes.PAWN)) {
            return "P";
        }
        return "";
    }
}
