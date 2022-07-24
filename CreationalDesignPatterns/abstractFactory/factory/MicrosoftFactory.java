package abstractFactory.factory;

import abstractFactory.products.Console;
import abstractFactory.products.Controller;
import abstractFactory.products.PScontroller;
import abstractFactory.products.XboxConsole;
import abstractFactory.products.XboxController;

public class MicrosoftFactory implements Factory{

    @Override
    public Console createConsole() {
        //Creates and returns the specified family-type object
        return new XboxConsole();
    }

    @Override
    public Controller createController() {
        //Creates and returns the specified family-type object
        return new XboxController();
    }
    
}
