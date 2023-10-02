package DIP_Wrong;

import java.lang.reflect.Array;

import static java.lang.Thread.sleep;

public class GameLoopController {
    private final GameUpdates gameUpdates = new GameUpdates();
    private final InputManager inputManager = new InputManager();
    private final OutputManager outputManager = new OutputManager();

    public GameLoopController() {
        System.out.println("Launching the game");
        gameLoop();
    }

    public void gameLoop() {
        while (true) {
            delay(1000);
            inputManager.update();
            gameUpdates.update();
            outputManager.update();

        }
    }

    private static void delay(int t) {
        try {
            sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
