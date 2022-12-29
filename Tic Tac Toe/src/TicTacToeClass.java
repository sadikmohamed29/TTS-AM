
public class TicTacToeClass {
  // instance variables
  private char[][] board;
  private int turns;

  // constructor
  public TicTacToeClass() {
    board = new char[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }
    turns = 0;
  }

  // accessors
  public boolean isWinner(char p) {
    // check rows
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == p && board[i][1] == p && board[i][2] == p) {
        return true;
      }
    }
    // check columns
    for (int j = 0; j < 3; j++) {
      if (board[0][j] == p && board[1][j] == p && board[2][j] == p) {
        return true;
      }
    }
    // check diagonals
    if (board[0][0] == p && board[1][1] == p && board[2][2] == p) {
      return true;
    }
    if (board[0][2] == p && board[1][1] == p && board[2][0] == p) {
      return true;
    }
    return false;
  }

  public boolean isFull() {
    return turns == 9;
  }

  public boolean isCat() {
    return isFull() && !isWinner('X') && !isWinner('O');
  }

  public boolean isValid(int r, int c) {
    return r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == ' ';
  }

  public int numTurns() {
    return turns;
  }

  public char playerAt(int r, int c) {
    return board[r][c];
  }

  public void displayBoard() {
    System.out.println();
    for (int i = 0; i < 3; i++) {
      System.out.print(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " ");
      if (i < 2) {
        System.out.println("\n---|---|---");
      }
    }
    System.out.println();
  }

  // modifiers
  public void playMove(char p, int r, int c) {
    if (isValid(r, c)) {
      board[r][c] = p;
      turns++;
    }
  }
}

