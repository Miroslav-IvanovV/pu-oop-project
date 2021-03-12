package pieces;

import java.awt.*;

public abstract class Piece {

    protected int row;
    protected int col;
    protected char colour;

    public abstract void render(Graphics g);
}
