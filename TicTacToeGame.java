package com.bridgeLab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	private static Scanner sc = new Scanner(System.in);

	// assigning empty space to board
	public static void assignBoardEmptySpace(char[] board) {

		for (int i = 1; i < board.length; i++)
			board[i] = ' ';
	}

	// taking input from user
	public static char chooseInput() {

		System.out.println("Enter the choice x or o");
		char input = sc.next().charAt(0);
		return input;
	}

	// printing board
	public static void showBoard(char[] board) {

		System.out.println("---Show board---");
		int pos = 1;
		System.out.println(" " + board[pos] + "   |  " + board[pos + 1] + "  |  " + board[pos + 2]);
		System.out.println("____________");
		System.out.println(" " + board[pos + 3] + "   |  " + board[pos + 4] + "  |  " + board[pos + 5]);
		System.out.println("____________");
		System.out.println(" " + board[pos + 6] + "   |  " + board[pos + 7] + "  |  " + board[pos + 8]);
		System.out.println("____________");

	}

	// Taking input at specified position
	public static void inputAtEmptyPosition(char[] board, char userInput) {

		System.out.println("\nGive specify position: (1 - 9) ");
		int pos = sc.nextInt();
		while (true && (pos < 10)) {
			if (board[pos] == ' ') {
				board[pos] = userInput;
				break;
			}
			if (board[pos] != ' ')
				System.out.println("Position filled..choose different position");
		}
		showBoard(board);
	}

	// Who plays first
	public static String checkWhoPlaysFirst() {

		int i = (int) (Math.floor(Math.random() * 10)) % 2 + 1;
		if (i == 1)
			return "user";
		else
			return "computer";
	}

	// Determine next player or winning
	public static void determineWinnerAndChangeTheTurn(char[] board, char p1Input) {

		inputAtEmptyPosition(board, p1Input);
		// player2
		System.out.println("player2 chance: ");
		char p2Input = p1Input == 'x' ? 'o' : 'x';
		inputAtEmptyPosition(board, p2Input);
		showBoard(board);
		while (true) {

			// player1
			System.out.println("player1 chance: ");
			p1Input = p2Input == 'x' ? 'o' : 'x';
			inputAtEmptyPosition(board, p1Input);
			// checking winning position on board
			if (winningPositionReached(board)) {
				System.out.println("Player1 won!!");
				break;
			}
			showBoard(board);
			// player2
			p2Input = p1Input == 'x' ? 'o' : 'x';
			System.out.println("player2 chance: ");
			inputAtEmptyPosition(board, p2Input);
			if (winningPositionReached(board)) {
				System.out.println("Player2 won!!");
				break;
			}
			showBoard(board);
		}
		showBoard(board);

	}

	// Winning position calculation
	public static boolean winningPositionReached(char[] board) {
		System.out.println("---Calculating winnig position---");

		if ((board[1] == board[2]) && (board[2] == board[3]) && (board[2] != ' '))
			return true;
		else if ((board[1] == board[5]) && (board[5] == board[9]) && (board[1] != ' '))
			return true;
		else if ((board[1] == board[4]) && (board[4] == board[7]) && (board[1] != ' '))
			return true;
		if ((board[2] == board[5]) && (board[8] == board[5]) && (board[2] != ' '))
			return true;
		else if ((board[3] == board[6]) && (board[3] == board[9]) && (board[3] != ' '))
			return true;
		else if ((board[3] == board[5]) && (board[5] == board[7]) && (board[3] != ' '))
			return true;
		else if ((board[4] == board[5]) && (board[4] == board[6]) && (board[4] != ' '))
			return true;
		else if ((board[3] == board[6]) && (board[3] == board[9]) && (board[3] != ' '))
			return true;
		else if ((board[7] == board[8]) && (board[7] == board[9]) && (board[7] != ' '))
			return true;
		return false;
	}

	// driver main method
	public static void main(String[] args) {

		char[] board = new char[10];
		assignBoardEmptySpace(board);
		showBoard(board);
		char userInput = chooseInput();
		char computerInput = userInput == 'x' ? 'o' : 'x';
		String turn = checkWhoPlaysFirst();
		if (turn.equals("user"))
			determineWinnerAndChangeTheTurn(board, userInput);
		else
			determineWinnerAndChangeTheTurn(board, userInput);
	}

}
