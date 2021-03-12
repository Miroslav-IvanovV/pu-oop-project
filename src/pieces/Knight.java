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

    }
}
