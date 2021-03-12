package pieces;

import java.awt.*;

public class Dwarf extends Piece{

    public Dwarf(int row , int col, Color colour) {
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.health_points = 12;
        this.attackDMG = 6;
        this.attackRange = 2;
        this.movementSpeed = 2;
        this.healing = 5;
        this.armour = 2;

    }
    public void render(Graphics g){
        g.setColor(this.colour);
        g.fillOval(this.col * 100 + 25,this.row * 100 + 25,50,50);
    }
}
