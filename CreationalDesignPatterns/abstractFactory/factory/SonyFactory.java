package abstractFactory.factory;

import abstractFactory.products.Console;
import abstractFactory.products.Controller;
import abstractFactory.products.PSconsole;
import abstractFactory.products.PScontroller;

public class SonyFactory implements Factory {

    @Override
    public Console createConsole() {
        //Creates and returns the specified family-type object
        return new PSconsole();

    }

    @Override
    public Controller createController() {
        //Creates and returns the specified family-type object
        return new PScontroller();

    }

    
}
