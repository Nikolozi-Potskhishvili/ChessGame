import java.util.ArrayList;
import java.util.List;

public class Player {
    private ChessBoard chessBoard;
    private Player opponent;

    private String color;
    private List<ChessPiece> playersPieces;

    public Player(ChessBoard chessBoard, Player opponent, String color) {
        this.chessBoard = chessBoard;
        this.opponent = opponent;
        this.color = color;
        playersPieces = new ArrayList<>();
    }

    private void initPieces() {

    }
}
