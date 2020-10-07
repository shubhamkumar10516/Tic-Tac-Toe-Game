package com.bridgeLab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	private static Scanner sc = new Scanner(System.in);

	// assigning empty space to board
	public static void assignBoardEmptySpace(char[] ch) {
        System.out.println("---Show board---");
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
	public static void showBoard(char[] ch) {
		for(int i = 0 ; i < ch.length ; i++)
			System.out.print(ch[i]+" ");
	}
	public static void main(String[] args) {

		char[] board = new char[10];
		assignBoardEmptySpace(board);
		char userInput = chooseInput();
		char computerInput = userInput == 'x' ? 'o':'x';
		showBoard(board);
	}
}
