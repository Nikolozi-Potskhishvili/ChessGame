import java.util.*;

public class PlayerInput {

   /*
    gets imput form console first two integers are coordinates of first
    cell second two coordinates of second cell
    */
    public static int[][] getPlayersMove() {
        System.out.println("Please enter your move: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        int[][] coordinates = new int[2][];

        int[] firstCell = new int[2];
        int[] secondCell = new int[2];

        firstCell[0] = tokenizer.nextToken().charAt(0) - 'A';
        firstCell[1] = Integer.valueOf(tokenizer.nextToken());

        secondCell[0] = tokenizer.nextToken().charAt(0) - 'A';
        secondCell[1] = Integer.valueOf(tokenizer.nextToken());

        coordinates[0] = firstCell;
        coordinates[1] = secondCell;
        /*for(int[] x : coordinates) {
            for(int y : x) {
                System.out.println(y);
            }
        }*/
        return coordinates;
    }
}
