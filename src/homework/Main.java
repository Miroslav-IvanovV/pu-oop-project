package homework;

import gameBoard.GameBoard;
import loader.Loader;
import renderer.Renderer;

public class Main {

    public static void main(String[] args) {
        Loader loader     = new Loader();
        GameBoard gameBoard     = new GameBoard(loader.load());
        Renderer renderer       = new Renderer(gameBoard);
    }
}
