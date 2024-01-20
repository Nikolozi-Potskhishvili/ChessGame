import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessGraphics extends JFrame implements ChessConstants {
    private ChessBoard board;
    JPanel boardPanel;

    public ChessGraphics(ChessBoard board) {
        super("Chess Game");
        this.board = board;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, SIZE * 100, SIZE * 100);
        this.setLayout(new GridLayout(SIZE, SIZE));
        initializeBoard();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void updateGraphics() {
        getContentPane().removeAll();
        initializeBoard();
        revalidate();
        repaint();
    }

    private void initializeBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                ChessPiece piece = board.getChessPiece(row, col);
                JLabel cellLabel = new JLabel();
                cellLabel.setPreferredSize(new Dimension(100, 100));
                cellLabel.setHorizontalAlignment(JLabel.CENTER);
                cellLabel.setVerticalAlignment(JLabel.CENTER);

                if ((row + col) % 2 == 0) {
                    cellLabel.setBackground(new Color(240, 217, 181));
                } else {
                    cellLabel.setBackground(new Color(181, 136, 99));
                }

                cellLabel.setOpaque(true); // Ensure background color is visible

                if (piece != null) {
                    cellLabel.setText(piece.getSymbol());
                    cellLabel.setFont(new Font("SansSerif", Font.PLAIN, 30));
                    cellLabel.setForeground(piece.getColor().equals("White") ? Color.WHITE : Color.BLACK);
                    cellLabel.addMouseListener(new MouseListener() {
                        private ChessMove curMove;
                        public void mouseClicked(MouseEvent e) {

                        }

                        public void mousePressed(MouseEvent e) {

                        }

                        public void mouseReleased(MouseEvent e) {

                        }

                        public void mouseEntered(MouseEvent e) {

                        }

                        public void mouseExited(MouseEvent e) {

                        }
                    });
                }

                getContentPane().add(cellLabel);
            }
        }
    }



}
