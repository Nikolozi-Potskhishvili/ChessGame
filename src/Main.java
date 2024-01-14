public class Main {
    public static void main(String[] args) {
/*
        InputHandler inputHandler = new InputHandler();
        for(int i = 0; i < 4; i++) {
            String[] cur = inputHandler.getMove();
            System.out.println(Arrays.toString(cur));
        }
*/      System.setProperty("file.encoding", "UTF-8");
        System.out.println("Pawn (White): \u2659");
        System.out.println("Pawn (Black): \u265F");
        System.out.println("Empty Light Cell: \u25A1");
        System.out.println("Empty Dark Cell: \u25A0");
        ChessBoard board = new ChessBoard(new Player("White"), new Player("Black"));
        System.out.println(board.toString());
    }
}
