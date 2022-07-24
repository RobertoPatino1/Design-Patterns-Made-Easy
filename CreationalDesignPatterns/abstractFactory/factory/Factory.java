package abstractFactory.factory;

import abstractFactory.products.Console;
import abstractFactory.products.Controller;

public interface Factory {

    Console createConsole();
    Controller createController();
    
    
}
