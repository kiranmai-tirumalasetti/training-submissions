package myown;
	import java.util.Scanner;

	public class TicTacToe {

	    private static char[][] board = {
	        {' ', ' ', ' '},
	        {' ', ' ', ' '},
	        {' ', ' ', ' '}
	    };

	    private static char currentPlayer = 'X';

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean gameEnded = false;

	        System.out.println("=== Welcome to Tic Tac Toe ===");
	        printBoard();

	        while (!gameEnded) {
	            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 1-3): ");
	            int row = scanner.nextInt() - 1;
	            int col = scanner.nextInt() - 1;

	            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
	                System.out.println("Invalid move. Try again!");
	                continue;
	            }

	            if (board[row][col] != ' ') {
	                System.out.println("That cell is already occupied. Try again!");
	                continue;
	            }

	            board[row][col] = currentPlayer;
	            printBoard();

	            // Check for winner
	            if (hasWon(currentPlayer)) {
	                System.out.println("🎉 Player " + currentPlayer + " wins!");
	                gameEnded = true;
	            } 
	            // Check for draw
	            else if (isBoardFull()) {
	                System.out.println("It's a draw!");
	                gameEnded = true;
	            } 
	            else {
	                // Switch player
	                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	            }
	        }

	        scanner.close();
	    }

	    // Print current board
	    private static void printBoard() {
	        System.out.println("-------------");
	        for (int i = 0; i < 3; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(board[i][j] + " | ");
	            }
	            System.out.println();
	            System.out.println("-------------");
	        }
	    }

	    // Check if current player has won
	    private static boolean hasWon(char player) {
	        // Check rows
	        for (int i = 0; i < 3; i++) {
	            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
	                return true;
	        }

	        // Check columns
	        for (int j = 0; j < 3; j++) {
	            if (board[0][j] == player && board[1][j] == player && board[2][j] == player)
	                return true;
	        }

	        // Check diagonals
	        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
	            return true;

	        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
	            return true;

	        return false;
	    }

	    // Check if board is full (draw)
	    private static boolean isBoardFull() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (board[i][j] == ' ') {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}


