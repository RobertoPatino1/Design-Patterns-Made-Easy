package abstractFactory.products;

public class XboxController implements Controller{

    @Override
    public void turnOn() {
        System.out.println("Xbox controller turning on");
        
    }

    @Override
    public void turnOff() {
        System.out.println("Xbox controller turning off");
        
    }

    @Override
    public void play() {
        System.out.println("Entering Xbox controller game mode");
        
    }

    @Override
    public void move() {
        System.out.println("Xbox controller moving");
        
    }
    
}
