package abstractFactory.products;

public class PSconsole implements Console {

    @Override
    public void turnOn() {
        System.out.println("Play station turning on");
        
    }

    @Override
    public void turnOff() {
        System.out.println("Play station turning off");
        
    }

    @Override
    public void restart() {
        System.out.println("Play station restarting");
        
    }
    
    
}
