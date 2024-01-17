public class Main {
    public static void main(String[] args) {
/*
        InputHandler inputHandler = new InputHandler();
        for(int i = 0; i < 4; i++) {
            String[] cur = inputHandler.getMove();
            System.out.println(Arrays.toString(cur));
        }
*/
        ChessGame game = new ChessGame();
        game.startGame();
    }
}
