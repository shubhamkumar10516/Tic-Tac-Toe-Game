package com.bridgeLab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	private static Scanner sc = new Scanner(System.in);

	// assigning empty space to board
	public static void assignBoardEmptySpace(char[] ch) {

		for (int i = 1; i < ch.length; i++)
			ch[i] = ' ';
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
		for (int i = 1; i <= 3; i++)
			System.out.print(i + ": |" + board[i] + "| ");
		System.out.println();
		for (int i = 4; i <= 6; i++)
			System.out.print(i + ": |" + board[i] + "| ");
		System.out.println();
		for (int i = 7; i <= 9; i++)
			System.out.print(i + ": |" + board[i] + "| ");

	}

	private static void inputAtEmptyPosition(char[] board, char userInput) {
		System.out.println("Give specify position: (1 -9) ");
		int pos = sc.nextInt();
		while (true) {
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
