package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		// Uso toString Position pos=new Position(3,5);
		//System.out.println(pos);
		
		ChessMatch chessMatch=new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		

	}

}
