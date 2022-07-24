package abstractFactory.products;

public class PScontroller implements Controller {

    @Override
    public void turnOn() {
        System.out.println("Play station dualshock turning on");
        
    }

    @Override
    public void turnOff() {
        System.out.println("Play station dualshock turning off");
        
    }

    @Override
    public void play() {
        System.out.println("Entering dualshock game mode");
        
    }

    @Override
    public void move() {
        System.out.println("Dualshock moving");
        
    }
    
}
