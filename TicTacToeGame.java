package com.bridgeLab.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	public static Scanner sc = new Scanner(System.in);
	public static void assignBoardEmptySpace(char[] ch) {
		
		for(int i = 1 ; i < ch.length ; i++)
			ch[i] = ' ';
	}
	public static char chooseInput() {
		System.out.println("Enter the choice x or o");
		char input =  sc.next().charAt(0);
		return input;
	}
	public static void main(String[] args) {
		
	    char[] board = new char[10];
		assignBoardEmptySpace(board);
		char input = chooseInput();
	}
}
