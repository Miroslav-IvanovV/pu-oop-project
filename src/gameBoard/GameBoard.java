package gameBoard;

import pieces.Piece;

import java.awt.*;

public class GameBoard {
    private Piece[][] pieceCollection;
    private Piece selectedPiece = null;

    public GameBoard(Piece[][] pieceCollection) {this.pieceCollection = pieceCollection; }

    public Piece getSelectedPiece() {
        return selectedPiece;
    }

    public void setSelectedPiece(Piece selectedPiece) {
        this.selectedPiece = selectedPiece;
    }

    public Piece getPiece(int row, int col) {
        return this.pieceCollection[row][col];
    }


    /**
     help rendering the game board
     */
    public void renderGameTile(Graphics g, int row, int col) {
        if(pieceCollection[row][col] instanceof Piece)
        pieceCollection[row][col].render(g);
    }


}
