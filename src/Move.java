public class Move {
   private int[][] move;

   public Move(int[][] move) {
       this.move = move;
   }

    public int getFirstCellX() {
        return  move[0][0];
    }

    public int getFirstCellY() {
        return  move[0][1];
    }

    public int getSecondCellX() {
        return  move[1][0];
    }

    public int getSecondCellY() {
        return  move[1][1];
    }


   public boolean moveIsValid(Board board, String color) {
       return true;
   }
}
