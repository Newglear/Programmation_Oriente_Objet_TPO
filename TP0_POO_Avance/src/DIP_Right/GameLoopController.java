package DIP_Right;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class GameLoopController {
    private final List<ISystem> systems = new ArrayList<>();

    public GameLoopController() {
        System.out.println("Launching the new game");
        systems.add(new GameUpdates());
        systems.add(new InputManager());
        systems.add(new OutputManager());
        gameLoop();
    }

    public void gameLoop() {
        while (true) {
            delay(1000);
            for(ISystem system : systems) {
                system.update();
            }
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
