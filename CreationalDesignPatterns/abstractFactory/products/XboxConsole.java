package abstractFactory.products;

public class XboxConsole implements Console {

    @Override
    public void turnOn() {
        System.out.println("Xbox turning on");
        
    }

    @Override
    public void turnOff() {
        System.out.println("Xbox turning off");
        
    }

    @Override
    public void restart() {
        System.out.println("Xbox restarting");
        
    }
    
}
