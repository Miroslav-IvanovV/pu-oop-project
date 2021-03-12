package pieces;

import java.awt.*;

public class Elf extends Piece{

    public Elf(int row , int col, Color colour) {
        this.row = row;
        this.col = col;
        this.colour = colour;
        this.health_points = 10;
        this.attackDMG = 5;
        this.attackRange = 3;
        this.movementSpeed = 3;
        this.healing = 6;
        this.armour = 1;

    }
    public void render(Graphics g){
        g.setColor(this.colour);
        g.fillOval(this.col * 100 + 25,this.row * 100 + 25,50,50);
    }
}
