package DIP_Right;

public class OutputManager implements ISystem {
    OutputManager() {
        System.out.println("Updating the rendering");
    }

    @Override
    public void update() {
        System.out.println("Rendering the game");
    }
}
