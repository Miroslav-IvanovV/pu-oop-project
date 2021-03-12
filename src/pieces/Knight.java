package pieces;

import java.awt.*;

public class Knight extends Piece{

    public Knight(int row , int col, Color colour) {
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.health_points = 15;
        this.attackDMG = 8;
        this.attackRange = 1;
        this.movementSpeed = 1;
        this.healing = 5;
        this.armour = 3;

    }

    public void render(Graphics g){
        g.setColor(this.colour);
        g.fillOval(this.col * 100 + 25,this.row * 100 + 25,50,50);
    }

    public Color getColor() {
        return this.colour;
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
