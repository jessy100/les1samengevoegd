package factories;

import JavaMVCViews.ErrorView;
import JavaMVCViews.HelloWorldView;
import JavaMVCViews.HelloWorldViewInterface;
import JavaMVCViews.LoginView;

public class ViewFactory {

    public HelloWorldViewInterface getView(String viewName) {
        if (viewName == null) {
            return null;
        }
        if (viewName.equalsIgnoreCase("HOME")) {
            return new HelloWorldView();

        } else if (viewName.equalsIgnoreCase("LOGIN")) {
            return new LoginView();

        } else if (viewName.equalsIgnoreCase("ERROR")) {
            return new ErrorView();
        }
        return null;
    }

    public void setMyLabel(String string) {
        new HelloWorldView().myLabel.setText(string);
    }//arne
}
