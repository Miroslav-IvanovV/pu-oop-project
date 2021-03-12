package loader;

import pieces.Dwarf;
import pieces.Elf;
import pieces.Knight;
import pieces.Piece;

import java.awt.*;
import java.util.Random;

public class Loader {
    Piece[][] pieceCollection = new Piece[9][9];
    public static boolean areSquaresRendered = false;

    public Piece[][] load(){
        loadingYellowOnes();
        loadingGreenOnes();

        return pieceCollection;
    }

    private void loadingYellowOnes(){
        pieceCollection[0][1] = new Knight(0,1, Color.YELLOW);
        pieceCollection[0][2] = new Knight(0,2, Color.YELLOW);
        pieceCollection[0][3] = new Elf(0,3, Color.YELLOW);
        pieceCollection[0][4] = new Elf(0,4, Color.YELLOW);
        pieceCollection[0][5] = new Dwarf(0,5, Color.YELLOW);
        pieceCollection[0][6] = new Dwarf(0,6, Color.YELLOW);

    }

    private void loadingGreenOnes(){
        pieceCollection[8][1] = new Knight(8,1, Color.GREEN);
        pieceCollection[8][2] = new Knight(8,2, Color.GREEN);
        pieceCollection[8][3] = new Elf(8,3, Color.GREEN);
        pieceCollection[8][4] = new Elf(8,4, Color.GREEN);
        pieceCollection[8][5] = new Dwarf(8,5, Color.GREEN);
        pieceCollection[8][6] = new Dwarf(8,6, Color.GREEN);

    }

    /**
     random number generator
     */
    public static int randomGenerator(int bound){
        Random rand = new Random();
        int random = rand.nextInt(bound);
        return random;
    }

    public static void  renderingTheSquares(Graphics g){
        renderingRedSquares(g);
        renderingGreySquares(g);
        renderingBlackAndWhiteSquares(g);
        areSquaresRendered = true;
    }

    private static void renderingRedSquares(Graphics g){
        for(int i = 0; i < 9; i++){
            g.setColor(Color.RED);
            g.fill3DRect(i * 100,0 * 100,100,100,true);
        }

        for(int i = 0; i < 9; i++){
            g.setColor(Color.RED);
            g.fill3DRect(i * 100,8 * 100,100,100,true);
        }
    }

    private static void renderingGreySquares(Graphics g){
        for(int i = 0; i < 9; i++){
            for(int j = 3; j < 6; j++){
                g.setColor(Color.GRAY);
                g.fill3DRect(i * 100,j * 100,100,100,true);
            }
        }
    }

    private static void renderingBlackAndWhiteSquares(Graphics g){
        for(int i = 1; i < 3; i++){
            for(int j = 0; j < 9; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.BLACK);
                    g.fill3DRect(j * 100, i * 100, 100, 100, true);
                }
                else {
                    g.setColor(Color.WHITE);
                    g.fill3DRect(j * 100, i * 100, 100, 100, true);
                }
            }
        }

        for(int i = 6; i < 8; i++){
            for(int j = 0; j < 9; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.BLACK);
                    g.fill3DRect(j * 100, i * 100, 100, 100, true);
                }
                else {
                    g.setColor(Color.WHITE);
                    g.fill3DRect(j * 100, i * 100, 100, 100, true);
                }
            }
        }
    }

}
