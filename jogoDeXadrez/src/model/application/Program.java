package model.application;

import model.boardgame.Board;
import model.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessmatch = new ChessMatch();
        UI.printBoard(chessmatch.getPieces());



    }
}
