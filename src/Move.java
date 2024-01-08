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
       Piece currentPiece = board.getCell(getFirstCellY(),getFirstCellX()).getPieceOnCell();
       if(currentPiece.getPieceType().equals("P")) {

       } else if(currentPiece.getPieceType().equals("H")) {

       } else if(currentPiece.getPieceType().equals("R")) {

       } else if(currentPiece.getPieceType().equals("B")) {

       } else if(currentPiece.getPieceType().equals("Q")) {

       } else if(currentPiece.getPieceType().equals("K")) {

       }
   }

   public static boolean isValidMoveForPawn() {

   }

   public static boolean isValidMoveForRook() {

   }

   public static boolean isValidMoveForHorse() {

   }

   public static boolean isValidMoveForBishop() {

   }

   public static boolean isValidMoveForQueen() {

   }

   public static boolean isValidMoveForKing() {

   }

}
