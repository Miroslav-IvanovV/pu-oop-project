package pieces;

import java.awt.*;

public abstract class Piece {

    protected int row;
    protected int col;
    protected Color colour;
    protected int health_points;
    protected int attackDMG;
    protected int attackRange;
    protected int movementSpeed;
    protected int healing;
    protected int armour;



    public abstract void render(Graphics g);

    public abstract  Color getColor();
    public abstract  int getRow();
    public abstract  int getCol();
    public abstract  void setRow(int row);
    public abstract  void setCol(int col);
}
