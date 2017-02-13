package JavaMVCViews;

import java.awt.EventQueue;
import java.awt.MenuContainer;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.io.Serializable;

import javax.accessibility.Accessible;
import javax.swing.RootPaneContainer;
import javax.swing.WindowConstants;

public interface HelloWorldViewInterface extends ImageObserver, MenuContainer, Serializable, Accessible, WindowConstants, RootPaneContainer {

    /**
     * @param args the command line arguments
     */
    static void main(String args[]) {


        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorldView().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    void initComponents()// </editor-fold>//GEN-END:initComponents
    ;

    void loadDataMouseClicked(MouseEvent evt)//GEN-LAST:event_loadDataMouseClicked
    ;

    void writeDataMouseClicked(MouseEvent evt)//GEN-LAST:event_writeDataMouseClicked
    ;

    void setVisible(boolean isVisible);

    void setMyLabel(String s);//observer

}
