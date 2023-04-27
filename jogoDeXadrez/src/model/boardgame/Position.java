package model.boardgame;

public class Position {

    private int row;
    private int column;

    public Position() {
    }

    public Position(int row, int collumn) {
        this.row = row;
        this.column = collumn;
    }

    public void setValues(int row, int collumn){

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString(){
        return row + ", " + column;
    }
}
