package abstractFactory;

import java.util.ResourceBundle.Control;

import javax.sound.sampled.SourceDataLine;

import abstractFactory.factory.MicrosoftFactory;
import abstractFactory.factory.SonyFactory;
import abstractFactory.products.Console;
import abstractFactory.products.Controller;
import abstractFactory.products.PSconsole;

public class Client {
    public static void main(String[] args) {
        //Cliente only needs to call the build methods on the desired factory

        SonyFactory sonyFactory = new SonyFactory();

        //No need for the client to relly on concretions, just abstractions
        Console psConsole = sonyFactory.createConsole();

        Controller psController = sonyFactory.createController();


        //Creating a new Factory which only returns Xbox family products....
        MicrosoftFactory microsoftFactory = new MicrosoftFactory();

        Console xboxConsole = microsoftFactory.createConsole();

        Controller xboxController = microsoftFactory.createController();


        System.out.println("-----Play Station products-----");
        psConsole.turnOn();
        psController.turnOn();
        psController.play();

        System.out.println("-----Xbox products-----");
        xboxConsole.turnOn();
        xboxController.turnOn();
        xboxController.play();


    }




    
    
    
}
