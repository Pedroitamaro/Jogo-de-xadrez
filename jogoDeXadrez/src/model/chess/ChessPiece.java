package model.chess;

import model.boardgame.Board;
import model.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board) {
        super(board);
    }

    public Color getColor() {
        return color;
    }
}
