package com.bridgeLab.tictactoe;

public class TicTacToeGame {

	
	public static void assignEmptySpace(char[] ch) {
		
		for(int i = 1 ; i < ch.length ; i++)
			ch[i] = ' ';
	}
	public static void main(String[] args) {
		
	    char[] ch = new char[10];
		assignEmptySpace(ch);
	}

}
