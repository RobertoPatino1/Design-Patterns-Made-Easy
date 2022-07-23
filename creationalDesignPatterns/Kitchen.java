package builder;

public class Kitchen {
    //Kitchen is the Director class
    private PizzaBuilder builder;

    //Constructor that takes the desired builder as parameter
    public Kitchen(PizzaBuilder builder){
        this.builder = builder;
    }

    public void buildPizza(){
        //We use the PizzaBuilder to build the pizza
        builder.buildMace();
        builder.buildSalsa();
        builder.buildFilling();
        

        //We can also add extra behaviours in case we want to build a more complex type of object
    }

    public Pizza getPizza(){
        return builder.getResult();  //Returns the created pizza
    }
}
