package DIP_Right;

public class GameUpdates implements ISystem {
    GameUpdates() {
        System.out.println("Game updates initialized!");
    }

    @Override
    public void update() {
        System.out.println("Update the game's logic");
    }
}
