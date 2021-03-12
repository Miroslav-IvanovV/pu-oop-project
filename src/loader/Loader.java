package loader;

import pieces.Dwarf;
import pieces.Elf;
import pieces.Knight;
import pieces.Piece;

import java.awt.*;
import java.util.Random;

public class Loader {
    Piece[][] pieceCollection = new Piece[9][9];

    public Piece[][] load(){
        loadingRedOnes();
        loadingGreenOnes();

        return pieceCollection;
    }

    private void loadingRedOnes(){
        pieceCollection[0][1] = new Knight(0,1, Color.RED);
        pieceCollection[0][2] = new Knight(0,2, Color.RED);
        pieceCollection[0][3] = new Elf(0,3, Color.RED);
        pieceCollection[0][4] = new Elf(0,4, Color.RED);
        pieceCollection[0][5] = new Dwarf(0,5, Color.RED);
        pieceCollection[0][6] = new Dwarf(0,6, Color.RED);

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
}
