package renderer;

import gameBoard.GameBoard;
import loader.Loader;
import pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Renderer extends JFrame implements MouseListener {

    GameBoard gameBoardLogic;
    Piece secondClick = null;

    /**
     set the board parameters
     */
    public Renderer(GameBoard gameBoardLogic) {

        // Reference to game logic
        this.gameBoardLogic = gameBoardLogic;

        // Reference to UI logic
        this.setSize(900, 900);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = e.getY() / 100;
        int col = e.getX() / 100;

        if(gameBoardLogic.getSelectedPiece() == null){
            if(gameBoardLogic.getPiece(row,col) != null){

            } else {

            }

        } else if(secondClick == null){


        } else {

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     render the game
     */
    public void paint(Graphics g) {
        if(Loader.areSquaresRendered == false) Loader.renderingTheSquares(g);

        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {

                gameBoardLogic.renderGameTile(g,row,col);
            }
        }
    }

}
