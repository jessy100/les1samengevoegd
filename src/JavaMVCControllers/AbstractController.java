package JavaMVCControllers;

import CompositePattern.ControllerCompositeComponent;

public abstract class AbstractController implements ControllerCompositeComponent {

    public abstract void startApplication();

    public abstract String getMessage();

    public abstract boolean writeMessage(String message);

    @Override
    public final void templateMethod() {
        startApplication();

    }
}
