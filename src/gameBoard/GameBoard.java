package gameBoard;

import pieces.Piece;

import java.awt.*;

public class GameBoard {
    private Piece[][] pieceCollection;
    private Piece selectedPiece;
    public int row;

    public GameBoard(Piece[][] pieceCollection) {this.pieceCollection = pieceCollection; }

    public Piece getSelectedPiece() {
        return selectedPiece;
    }

    public void setSelectedPiece(Piece selectedPiece,int row) {
        this.row = row;
        this.selectedPiece = selectedPiece;
    }

    public Piece getPiece(int row, int col) {
        return this.pieceCollection[row][col];
    }

    public void movePiece(int row, int col){
        pieceCollection[row][col] = selectedPiece;
        pieceCollection[row][col].setCol(col);
        pieceCollection[row][col].setRow(row);
        pieceCollection[selectedPiece.getRow()][selectedPiece.getCol()] = null;
    }


    /**
     help rendering the game board
     */
    public void renderGameTile(Graphics g, int row, int col) {
        if(pieceCollection[row][col] instanceof Piece)
        pieceCollection[row][col].render(g);
    }


}
