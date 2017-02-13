/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;

import JavaMVCModels.HelloWorldModel;
import JavaMVCModels.ModelContext;
import JavaMVCViews.HelloWorldViewInterface;
import factories.ViewFactory;
import java.io.IOException;

import java.util.Observable;
import java.util.Observer;

/**
 * @author AfzaalAhmad
 */
public class HelloWorldController extends AbstractController implements Observer {

    static HelloWorldViewInterface view = new ViewFactory().getView("HOME");
    HelloWorldModel helloWorldView;

    @Override
    public void startApplication() {
        // View the application's GUI
        view.setVisible(true);
    }

    @Override
    public String getMessage() {
        try {
            ModelContext context = new ModelContext(new HelloWorldModel());
            return context.getData();
        } catch (IOException er) {
            return "There was an error.";
        }
    }

    @Override
    public boolean writeMessage(String message) {
        try {
            ModelContext context = new ModelContext(new HelloWorldModel());
            helloWorldView = (HelloWorldModel) context.getModel();
            helloWorldView.addObserver(this);

            return context.writeData(message);
        } catch (IOException er) {
            return false;
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        view.setMyLabel(arg.toString());
    }//observer

}
