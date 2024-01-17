import java.util.Scanner;

public class InputHandler {
    private ChessBoard board;
    private String currentPlayersColor;
    public InputHandler(ChessBoard board) {
        this.board = board;
    }

    public InputHandler() {

    }

    public static String[] getMove() {
        String[] input = new String[4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose starting row");
        input[0] = scanner.nextLine().toUpperCase();
        while (!isValidRow(input[0])) {
            System.out.println("Invalid input. Please choose starting row (A-H)");
            input[0] = scanner.nextLine().toUpperCase();
        }

        System.out.println("Please choose starting column");
        input[1] = scanner.nextLine();
        while (!isValidCol(input[1])) {
            System.out.println("Invalid input. Please choose starting column (1-8)");
            input[1] = scanner.nextLine();
        }

        System.out.println("Please choose ending row");
        input[2] = scanner.nextLine().toUpperCase();
        while (!isValidRow(input[2])) {
            System.out.println("Invalid input. Please choose ending row (A-H)");
            input[2] = scanner.nextLine().toUpperCase();
        }

        System.out.println("Please choose ending column");
        input[3] = scanner.nextLine();
        while (!isValidCol(input[3])) {
            System.out.println("Invalid input. Please choose ending column (1-8)");
            input[3] = scanner.nextLine();
        }

        return input;
    }

    private static boolean isValidRow(String row) {
        if(row.length() == 1 && row.charAt(0) >= 'A' && row.charAt(0) <= 'H') return true;
        return false;
    }

    private static boolean isValidCol(String col) {
        if(col.length() == 1 && col.charAt(0) >= '1' && col.charAt(0) <= '8') return true;
        return false;
    }
}
