package DIP_Right;

public class InputManager implements ISystem {
    InputManager() {
        System.out.println("Inputs initialized!");
    }

    @Override
    public void update() {
        System.out.println("Get inputs in the buffer");
    }
}
