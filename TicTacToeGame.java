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
			System.out.println(" "+board[pos] + "   |  " + board[pos+1] + "  |  "+ board[pos+2]);
			System.out.println("____________");
			System.out.println(" "+board[pos+3] + "   |  " + board[pos+4] + "  |  "+ board[pos+5]);
			System.out.println("____________");
			System.out.println(" "+board[pos+6] + "   |  " + board[pos+7] + "  |  "+ board[pos+8]);
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
	}

	public static void main(String[] args) {

		char[] board = new char[10];
		assignBoardEmptySpace(board);
		char userInput = chooseInput();
		char computerInput = userInput == 'x' ? 'o' : 'x';
		showBoard(board);
		inputAtEmptyPosition(board, userInput);
		showBoard(board);
	}

}
