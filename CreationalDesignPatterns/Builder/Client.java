package builder;

import builder.concreteBuilders.PizzaBuilder;

public class Client {
    public static void main(String[] args) {
        

        //First we create the Builder object
        PizzaBuilder builder = new PizzaBuilder();

        //Then we create the Director and pass the created builder as a parameter
        
        Kitchen director = new Kitchen(builder);


        //Now we build the disired object
        director.buildPepperoniPizza();


        //And finally we recover it
        Pizza builtPizza = director.getPizza();


        System.out.println("Your pizza: \n"+builtPizza);
    }
}
