/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahellocollections;

import CompositePattern.ControllerCompositeComposite;
import JavaMVCControllers.*;

/**
 *
 * @author AfzaalAhmad
 */
public class JavaHelloCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControllerCompositeComposite comp = new ControllerCompositeComposite();
        AbstractController controller = new HelloWorldController();
        AbstractController controller2 = new HelloWorldController();
        comp.lijst.add(controller);
        comp.lijst.add(controller2);
        // Start the application
        comp.templateMethod();
    }
}
