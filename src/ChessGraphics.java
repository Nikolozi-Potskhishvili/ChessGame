import javax.swing.*;
import java.awt.*;

public class ChessGraphics extends JFrame implements ChessConstants {
    private ChessBoard board;
    JPanel boardPanel;
    public ChessGraphics(ChessBoard board) {
        super("Chess Game");
        this.board = board;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, SIZE * 100, SIZE * 100);
        this.setLayout(new GridLayout(SIZE, SIZE));
        setLocationRelativeTo(null);
    }

    public void updateGraphics() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                ChessPiece piece = board.getChessPiece(row, col);
                JPanel cellPanel = new JPanel();
                cellPanel.setPreferredSize(new Dimension(100, 100));

                if ((row + col) % 2 == 0) {
                    cellPanel.setBackground(new Color(240, 217, 181));
                } else {
                    cellPanel.setBackground(new Color(181, 136, 99));
                }

                if (piece != null) {
                    JLabel pieceLabel = new JLabel(piece.getSymbol());
                    pieceLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
                    pieceLabel.setForeground(piece.getColor().equals("White") ? Color.WHITE : Color.BLACK);
                    cellPanel.add(pieceLabel);
                }

                add(cellPanel);
            }
        }
        setVisible(true);
    }

}
